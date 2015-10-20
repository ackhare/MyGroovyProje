package Closures.DemoFordelegate_resolution_startegy

/**
 * Created by chetan on 12/10/15.
 */
/*The difference between "delegate first" and "delegate only" or "owner first" and "owner only"
can be illustrated if one of the delegate (resp. owner) does not have such a method or property:
*/


class Person {
    String name
    int age
    def fetchAge = { age }
}
class Thing {
    String name
}

def p = new Person(name:'Jessica', age:42)
def t = new Thing(name:'Printer')
def cl = p.fetchAge
cl.delegate = p
assert cl() == 42
cl.delegate = t
assert cl() == 42
cl.resolveStrategy = Closure.DELEGATE_ONLY
cl.delegate = p
assert cl() == 42
cl.delegate = t
try {
cl()
    assert false
} catch (MissingPropertyException ex) {
    // "age" is not defined on the delegate
}

