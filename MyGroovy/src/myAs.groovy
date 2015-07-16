/**
 * Created by chetan on 5/22/15.
 */
//In Groovy, as operator has two usages:

 //       1. To define the alias of an imported class, such as

import java.lang.Math as M
println M.log10(100)

//2. For type-casting, such as

def i = '123' as int

//If a Class implemented asType(Class) method, you can use as operator on it.

println '123' as int == 123

