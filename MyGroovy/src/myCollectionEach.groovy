/**
 * Created by chetan on 5/21/15.
 */

/*
each method

You can use each method to iterate a Collection,
and the element of the Collection will be passed to the closure
 agrument of this method in each iteration. The code is like:

    list.each{ e -> ...}

For Map, there is another each mehod(k and v  means key and value respectively):

    map.each{ k, v -> ...}
 */
def total=0
[1, 3, 8, 2, 6].each{total += it }
print total

//20