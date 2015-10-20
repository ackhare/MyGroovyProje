package Closures.DemoForOwner_First

/**
 * Created by chetan on 12/10/15.
 */

class Person {
  String name
  def pretty = { "My name is $name" }
  //for the illustration, we define a closure member which references "name"
  String toString() {
    pretty()
  }
}
class Thing {
  String name
}
//both the Person and the Thing class define a name property
def p = new Person(name: 'Sarah')
def t = new Thing(name: 'Teapot')
/*
Using the default strategy, the name property is resolved on the owner first
so if we change the delegate to t which is an instance of Thing
there is no change in the result: name is first resolved on the owner of the closure
 */
println p.toString() == 'My name is Sarah'
p.pretty.delegate = t
println p.toString() == 'My name is Sarah'



//However, it is possible to change the resolution strategy of the closure:
p.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println p.toString() == 'My name is Teapot'
/*
By changing the resolveStrategy, we are modifying the way Groovy will resolve the "implicit this" references:
in this case, name will first be looked in the delegate, then if not found, on the owner.
Since name is defined in the delegate, an instance of Thing, then this value is used.
 */

