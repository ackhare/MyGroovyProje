package Closures.DemoForThisClosure

/**
 * Created by chetan on 6/10/15.
 */


//In a closure, calling getThisObject will return the enclosing class where the closure is defined.
// It is equivalent to using an explicit this:

class Enclosing {
  void run() {
    //a closure is defined inside the Enclosing class, and returns getThisObject
    //   calling the closure will return the instance of Enclosing where the the closure is defined
    def whatIsThisObject = { getThisObject() }
    assert whatIsThisObject() == this
    //in general, you will just want to use the shortcut this notation
    def whatIsThis = { this }
    assert whatIsThis() == this
    //   and it returns exactly the same object as above
  }
}
class EnclosedInInnerClass {
  class Inner {
    //closure is defined in a inner class
    //   this in the closure will return the inner class, not the top-level one
    Closure cl = { this }
  }
  void run() {
    def inner = new Inner()
    assert inner.cl() == inner
  }
}
class NestedClosures {
  void run() {
    def nestedClosures = {
      //   in case of nested closures, like here cl being defined inside the scope of nestedClosures
      def cl = { this }
      cl()
    }
    assert nestedClosures() == this
    //   then this corresponds to the closest outer class, not the enclosing closure!
  }
}

