/**
 * Created by chetan on 5/22/15.
 */
//inject method will inject an initial value to a closure in the first iteration,
// and then it will pass the result of previous closure to the next closure.
// Usage: list.inject(arg){arg,item->...}.

//The initial value of s is 0, injected by this method
def l2=[1, 2, 3].inject(0){ s, item -> s += item }

print l2
//6