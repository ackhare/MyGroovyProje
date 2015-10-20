/**
 * Created by chetan on 5/22/15.
 */
//If you implement a comparator in Java, you could implement it this way:
/*
public int compare(int arg1, int arg2) {
    if (arg1 == arg2) return 0;
    else if (arg1 < arg2) return -1;
    else return 1;
}
*/
//As a Groovy programmer, you can use spaceship operator:

int compare(int arg1,int arg2){
    arg1<=>arg2
}
print(compare(2,2) == 0)
assert compare(1,2) == -1
assert compare(3,2) == 1