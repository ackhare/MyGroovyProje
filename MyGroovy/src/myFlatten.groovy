/**
 * Created by chetan on 5/21/15.
 */
//flatten method flattens a collection,
// all the items in that collection will be in a new collection to return.
// There is no embeded collection in the new collection.
//so removes any embedded collection
def l=[[1,2],3,4].flatten()
print l
//[1, 2, 3, 4]