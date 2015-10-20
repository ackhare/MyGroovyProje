package Closures.DemoForGString

/**
 * Created by chetan on 19/10/15.
 */


def x = 1
def gs = "x = ${x}"
println gs == 'x = 1' //true


x = 2
println gs == 'x = 2' //false
/*
You will see that the assert fails! There are two reasons for this:
1)a GString only evaluates lazily the toString representation of values
2)the syntax ${x} in a GString does not represent a closure but an expression to $x, evaluated when the GString is created.
 */

/*


If you need a real closure in a GString and f
or example enforce lazy evaluation of variables,
 you need to use the alternate syntax ${→ x} like in the fixed example:

 */

def x1 = 1
def gs1 = "x1 = ${-> x1}"
println gs1 == 'x1 = 1'

x1 = 2
println gs1 == 'x1 = 2'