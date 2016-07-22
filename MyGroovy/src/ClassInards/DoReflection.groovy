package ClassInards

/**
 * Created by chetan on 22/7/16.
 */
def doReflection(obj)
{
    println("Reflection:")
    println "\tClass Name: ${obj.class.name}"
    def methods = obj.class.declaredMethods
    def methodsNames = new StringBuilder()
    methods.each
            {
                methodsNames << it.name << " "
            }
    println "\tMethods Names: ${methodsNames}"
    def fields = obj.class.declaredFields
    def fieldsNames = new StringBuilder()
    fields.each
            {
                fieldsNames << it.name << " "
            }
    println "\tFields Names: ${fieldsNames}"
}