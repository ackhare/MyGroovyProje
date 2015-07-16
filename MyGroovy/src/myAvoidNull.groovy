/**
 * Created by chetan on 5/22/15.
 */

/*1-17：?. operator

In Groovy, you can use ?. operator to avoid NPE(Null Pointer Exception). The result of object?.method is:

if object = null, then result = null。
if object != null, then result = object.method
*/
def l= null // l is a list
print l?.size() == null

