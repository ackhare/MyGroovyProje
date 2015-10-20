package Closures.RightCurry

/**
 * Created by chetan on 19/10/15.
 */
def nCopies = { int n, String str -> str*n }
//the nCopies closure defines two parameters
def blah = nCopies.rcurry('bla')
//rcurry will set the last parameter to bla, creating
//a new closure (function) which accepts a single int
println blah(2) == 'blabla'
//so the new function call be called with only an int
println blah(2) == nCopies(2, 'bla')
//and it is equivalent to calling nCopies with two parameters
