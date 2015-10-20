/**
 * Created by chetan on 5/21/15.
 */
/*
step defines the start point and the end point of iteration, and specifies the step length
of each iteration. "a.step(b,c)" means that "from a up to b, the step increment used in each iteration is c".
 */
lst= []
1.step(9.5, 2.5){
    lst<< it
}
print lst

/*
[1, 3.5, 6.0, 8.5]
 */