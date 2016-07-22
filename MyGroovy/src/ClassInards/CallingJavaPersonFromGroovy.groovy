package ClassInards

/**
 * Created by chetan on 22/7/16.
 */
def person5 = new JavaPerson("Rubble", "Barney")
doToString(person5)
doInspect(person5)
doReflection(person5)
doDump(person5)
doProperties(person5)

// The methods shown above with names starting with "do" have
// been defined in previous code listings in this post, but
// doProperties is first shown here.

def doProperties(obj)
{
   println ".properties: ${obj.properties}"
}
def doToString(obj)
{
    println "toString(): ${obj}\n"
}

def doInspect(obj)
{
    // Inspect
    println "inspect(): ${obj.inspect()}\n"
}
def doDump(obj)
{
    println "dump(): ${obj.dump()}\n"
}
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