package Closures.DemoForGString

/**
 * Created by chetan on 19/10/15.
 */
//

//And let’s illustrate how it differs from mutation with this code:


class Person {
    String name
    String toString() { name }
}
//the Person class has a toString method returning the name property
def sam = new Person(name:'Sam')
//we create a first Person named Sam
def lucy = new Person(name:'Lucy')
//we create another Person named Lucy
def p = sam
//the p variable is set to Sam
def gs = "Name: ${p}"
//and a closure is created(I think this is an expression not clouse as mentioned in (http://www.groovy-lang.org/closures.html)
// under (Gstrings in closure)), referencing the value of p, that is to say Sam
println gs == 'Name: Sam'//true
// so when we evaluate the string, it returns Sam
p = lucy
println gs == 'Name: Sam'//true
// if we change p to Lucy
//the string still evaluates to Sam because it was the value of p when the GString was created
sam.name = 'Lucy'
println gs == 'Name: Lucy'//true
//so if we mutate Sam to change his name to Lucy  this time the GString is correctly mutated
