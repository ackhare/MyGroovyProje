/**
 * Created by chetan on 5/21/15.
 */
//sort method can sort a collection, such as l.sort(). You also can give a closure as a comparator.
def l= [1,3,8,2,6].sort{a, b ->
    b <=> a
}
print l == [8,6,3,2,1]