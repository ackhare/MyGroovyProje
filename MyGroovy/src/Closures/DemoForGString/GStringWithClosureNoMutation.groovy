package Closures.DemoForGString

/**
 * Created by chetan on 19/10/15.
 */



//So if you don’t want to rely on mutating objects or wrapping objects,
// you must use closures in GString by explicitly declaring an empty argument list:

class Person1 {
    String name
    String toString() { name }
}
def sam = new Person(name:'Sam')
def lucy = new Person(name:'Lucy')
def p = sam
// Create a GString with lazy evaluation of "p"
def gs = "Name: ${-> p}"
println gs == 'Name: Sam'//true
p = lucy
println gs == 'Name: Lucy'//true


