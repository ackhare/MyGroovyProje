/**
 * Created by chetan on 5/22/15.
 */

/*
curry()
When you curry a closure, you will get a new closure with prebinded parameters.
It is convenient to apply curry method to a closure with many parameters most of which are always not changed.

Be careful, curry only bind preceding parameters,
that is, if a closure has 3 parameters: p1, p2, p3, curry will bind p1 or "p1,p2". And "p1,p3" is not allowed.
*/
def multiple = { x, y -> x*y }
def twice = multiple.curry(2)
print twice(3)
