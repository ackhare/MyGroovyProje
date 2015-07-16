/**
 * Created by chetan on 5/22/15.
 */
//String can also be iteration range as what number does:

for(str in 'aa'..'ai' ){
    println str
}

//Be careful, the characters in these two strings must be the same but the last one.
// That is, 'ab'..'ab' and 'aaa'..'aaz' are ok, but 'aa'..'bb' and 'aaa'..'abc' are not.