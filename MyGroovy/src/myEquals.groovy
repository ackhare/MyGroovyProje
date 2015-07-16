/**
 * Created by chetan on 5/22/15.
 */
//In Java, == operator is for identity. While in Groovy, this operator is for equality.
// That is, if you use == operator, Groovy will translate it into an invocation of equals method.
def str1 = "groovy"
def str2 = new String("groovy")
print str1 == str2