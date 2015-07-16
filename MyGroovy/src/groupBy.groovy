/**
 * Created by chetan on 5/21/15.
 */

//When you want to group the items in a collection, you can use groupBy method.
def map=['tulip':23,'tomato':34,'lilly':35]
print map.groupBy{it.value>25}