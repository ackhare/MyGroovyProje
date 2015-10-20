package Closures.DemoForDelegateSanple

/**
 * Created by chetan on 12/10/15.
 */

class Person {
  String name
}
class Thing {
  String name
}

def p = new Person(name: 'Norman')
def t = new Thing(name: 'Teapot')



//Then let’s define a closure which fetches the name property on the delegate:

def upperCasedName = { delegate.name.toUpperCase() }


//Then by changing the delegate of the closure, you can see that the target object will change:

upperCasedName.delegate = p
println upperCasedName() == 'NORMAN'
upperCasedName.delegate = t
println upperCasedName() == 'TEAPOT'



//At this point, the behavior is not different from having a `
// variable defined in the lexical scope of the closure:

def target = p
def upperCasedNameUsingVar = { target.name.toUpperCase() }
println upperCasedNameUsingVar() == 'NORMAN'


/*
However there is are major differences:
in the last example, target is a local variable referenced from within the closure
the delegate can be used transparently,
that is to say without prefixing method calls with delegate. as explained in the next paragraph.

See DemoForDelegation
*/







