package Closures.DemoForDelegation

/**
 * Created by chetan on 12/10/15.
 */
class Person {
  String name
}
def p = new Person(name:'Igor')
def cl = { name.toUpperCase() }
//name is not referencing a variable in the lexical scope of the closure
cl.delegate = p
//we can change the delegate of the closure to be an instance of Person
println cl() == 'IGOR'
//and the method call will succeed

/*

The reason this code works is that the name property will be resolved transparently on the delegate object!
This is a very powerful way to resolve properties or method calls inside closures.
There’s no need to set an explicit delegate. receiver: the call will be made because the default delegation strategy
of the closure makes it so.
 */



