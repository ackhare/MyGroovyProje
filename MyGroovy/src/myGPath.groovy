/**
 * Created by chetan on 5/21/15.
 */

//GPath

//Accessing Object, you can use GPath. For nested object, you also can use GPath. It looks like: "Obj.prop".
class C{
    def p
}
class B{
    def p1
    C  p2
}
def a= new C(p:'China')
def b= new B(p1:"Xi'an", p2:a)
b.p1 + ", "+ b.p2.p == "Xi'an, China"