/**
 * Created by chetan on 5/22/15.
 */
/*In Groovy, You can iterate in many ways, such as,

len.times{...}
0.upto(len){...}
for(i in 0..len){...}
0.step(len, 1){...}
*/
//To calculate the sum of the numbers from 1 to 100:

def sum=0
//one hai l nahi hai
1.upto(100){sum+=it}
print sum
