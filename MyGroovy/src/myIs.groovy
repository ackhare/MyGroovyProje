/**
 * Created by chetan on 5/22/15.
 */
//In Groovy, you can use is method to determine whether two objects are the same instance, unlike java.
def str1 = "groovy"
def str2 = new String("groovy")
print str1.is(str2) == false