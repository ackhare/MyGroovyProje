package Closures.DemoForDelegateClosure

/**
 * Created by chetan on 6/10/15.
 */


class Enclosing {
    void run() {
      // 	you can get the delegate of a closure calling the getDelegate method
        def cl = { getDelegate() }
      //or using the delegate property
        def cl2 = { delegate }
       // 	both return the same object
        assert cl() == cl2()
      //which is the enclosing class or closure
        assert cl() == this
      // 	in particular in case of nested closures
        def enclosed = {
            { -> delegate }.call()
        }
        assert enclosed() == enclosed
      //delegate will correspond to the owner
    }
}


