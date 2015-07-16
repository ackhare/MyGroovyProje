/**
 * Created by chetan on 5/21/15.
 */
//collect method is similar to each method, the difference is the result
// of each iteration will be put into a new Collection.
// At the end of last iteration, this collection will be returned.
map=['width':18, 'height':20,'length':15]
print map.collect{ key, value ->
    key.toUpperCase()
}

//[WIDTH, HEIGHT, LENGTH]