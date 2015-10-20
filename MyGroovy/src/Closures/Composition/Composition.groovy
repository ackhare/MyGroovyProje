package Closures.Composition

/**
 * Created by chetan on 19/10/15.
 */


def plus2  = { it + 2 }
def times3 = { it * 3 }

def times3plus2 = plus2 << times3
println times3plus2(3) == 11 //true
println times3plus2(4) == plus2(times3(4)) //true

def plus2times3 = times3 << plus2
println plus2times3(3) == 15  //true
println plus2times3(5) == times3(plus2(5)) //true

// reverse composition
println times3plus2(3) == (times3 >> plus2)(3) //true


