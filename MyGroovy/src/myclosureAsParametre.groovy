/**
 * Created by chetan on 5/22/15.
 */
//Passed as a parameter

//Closure can be passed around as a parameter.

def repeat(n, c){
    n.times{
        c()
    }
}
print repeat(10, {print '*'})

//If Closure is the type of the last parameter of a function, you can write it like this:

repeat(10){print '*'}
