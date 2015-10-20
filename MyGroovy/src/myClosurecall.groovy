/**
 * Created by chetan on 5/21/15.
 */

//Calling a closure

//You can invoke a closure using "closure.call(args)",
// "call" can be ignored, so you can use "closure(args)" directly.
def add = { arg1, arg2-> arg1+arg2}
def l=add 1, 2
print l