package ConcurrencyWithoutGpars
//http://blog.shlrm.org/blog/2009/11/30/groovy-threading-and-java-threading/
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.Executors
import java.util.concurrent.Callable

def moveSingleDisk(source, dest) {
  //nothing!
}

def moveTower(number, source, dest, temp) {
  if (number > 0) {
    moveTower(number -1, source, temp, dest)
    moveSingleDisk(source, dest)
    moveTower(number - 1, temp, dest, source)
  }
}

AtomicInteger counter = new AtomicInteger()
counter.set(1)

synchronized out(message) {
  println message
}

def logic = {
  start = System.nanoTime()
  moveTower(it, 'A','B','C')
  stop = System.nanoTime()
  out("${it} took ${(stop-start)/ 10**6} milliseconds")
}

def THREADS=16

pool = Executors.newFixedThreadPool(THREADS)
println "Creating a pool for $THREADS threads"

1.upto(64) {
  def value = it
  //out "Submitting job $value"
  task = {c -> pool.submit( c as Callable)}
  task{logic(value)}
}

pool.shutdown()

