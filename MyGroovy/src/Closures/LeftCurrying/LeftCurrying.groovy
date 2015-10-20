package Closures.LeftCurrying

/**
 * Created by chetan on 19/10/15.
 */
def nCopies = { int n, String str -> str*n }
//the nCopies closure defines two parameters
def twice = nCopies.curry(2)
//curry will set the first parameter to 2,
// creating a new closure (function) which accepts a single String
println twice('bla') == 'blabla'            //true
println twice('bla') == nCopies(2, 'bla')   //true
/*so the new function call be called with only a String
and it is equivalent to calling nCopies with two parameters
*/