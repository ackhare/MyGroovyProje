/**
 * Created by chetan on 5/22/15.
 */
//Getting elements from a List

//You can use two ways to get elements from a List:

//With index, which is 0-based. If index >=0, you will get indexth element from beginning; if index < 0, you will get the indexth element from ending. "-1" means "the last one".
 //       With Range, you will get a sublist of a List

def l= [1,2,3,4]
assert l[2] == 3
assert l[-1] == 4
assert l[1..2] == [2,3]
