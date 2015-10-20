/**
 * Created by chetan on 5/21/15.
 */
def l1=[1, 3, 8, 2, 6].reverse()

print l1
//[6, 2, 8, 3, 1]

def lst1 = [1,2,3]
lst1.reverseEach{
    print it
}
//3 2 1
//This method is a each method passing element and its index to the closure.
def lst=[3,2,1]
def map=[:]
lst.eachWithIndex{value,index->
    map[value]=index
}
print map
//[3:0, 2:1, 1:2]

println()
//When you are invoking spread operator(*. operator) on a collection, you are invoking a method
// on each collection item, and all the result of these invocation
// will be organized as a collection to return.
def list = ['groovy', 'scala', 'clojure']
println list*.reverse()
print list*.reverse() == list.collect{it.reverse()}

[1,3,8,2,6].max()