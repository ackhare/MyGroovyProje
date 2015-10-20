package Closures.DemoForClosureOwner

/**
 * Created by chetan on 6/10/15.
 */


class Enclosing {
  void run() {
    //a closure is defined inside the Enclosing class, and returns getOwner
    def whatIsOwnerMethod = { getOwner() }
// 	calling the closure will return the instance of Enclosing where the the closure is defined
    assert whatIsOwnerMethod() == this
    // 	in general, you will just want to use the shortcut owner notation
    def whatIsOwner = { owner }
    assert whatIsOwner() == this // 	and it returns exactly the same object
  }
}
class EnclosedInInnerClass {
  class Inner {
    Closure cl = { owner }
    //if the closure is defined in a inner class
  }
  void run() {
    def inner = new Inner()
    assert inner.cl() == inner
    //owner in the closure will return the inner class, not the top-level one
  }
}
class NestedClosures {
  void run() {
    def nestedClosures = {
      def cl = { owner }
      //but in case of nested closures, like here cl being defined inside the scope of nestedClosures
      cl()
    }
    assert nestedClosures() == nestedClosures
    // 	then owner corresponds to the enclosing closure, hence a different object from this!
  }
}


