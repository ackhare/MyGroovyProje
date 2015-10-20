/**
 * Created by chetan on 5/22/15.
 */
//You can use .& operator to refer to a method as a closure, then you can use it as a closure.

def show(n){
    println n
}
def l=[1, 2, 3, 4].each(this.&show)
print(l)