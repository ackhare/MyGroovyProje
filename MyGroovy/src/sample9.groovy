/**
 * Created by chetan on 5/21/15.
 */
//Closure is a code block. You can give it a name and pass it everywhere or invoke it as a function.
// This is what it looks: {code block}. When invoking a closure, you also can pass some arguments
// to it like you are calling a function.

def square = {it * it}
square(5)
//If a closure has only one argument, you don't have to declare it, and you can refer to this argument with "it".