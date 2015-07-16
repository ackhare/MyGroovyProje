/**
 * Created by chetan on 5/21/15.
 */
/*
Properties and Fields

In GroovyBean, what you are defining actually
 is properties not fields. When you access it, Groovy will invoke its default getter/setter automatically:

    a.b=…   // invoking a.setB
    …=a.b   // invoking a.getB

If you want to have your own getter/setter, just do it.
 The way is the same as java —— implementing your getter/setter.

If you want to get the value of the field, you can use.@ operator: a.@b,
this actually accesses the field behind of property b.
 */
class A{
    def b
    def getB(){
        return 'B'
    }
}
def a = new A(b:'c')
assert a.b == 'B'
assert a.@b == 'c'
