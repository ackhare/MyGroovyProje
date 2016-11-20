package ConcurrencyWithoutGpars

/**
 * Created by chetan on 20/11/16.
 */
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.Future
//See more at: http://www.tothenew.com/blog/how-to-use-thread-pooling-using-groovy/#sthash.K3R3XLja.dpuf
def myClosure = {num -> println "I Love Groovy ${num}"}
def threadPool = Executors.newFixedThreadPool(4)
 try {
  List<Future> futures = (1..10).collect{num->
    threadPool.submit({->
    myClosure num } as Callable);
  }
  // recommended to use following statement to ensure the execution of all tasks.
  futures.each{it.get()}
}finally {
  threadPool.shutdown()
}
/*
In the above example, thread pool size is 4, that means concurrent 4
tasks would be executed in a single go. And task is the code in ‘myClosure’.

Let’s say you rely on output from tasks. Then you need to do something like following
1

Collection results = futures.collect{it.get()}
- See more at: http://www.tothenew.com/blog/how-to-use-thread-pooling-using-groovy/#sthash.K3R3XLja.dpuf
 */