package tracing

import sun.reflect.Reflection

/**
 * Created by chetan on 22/11/16.
 */
println 'demo'
def frame=1
Class c = Reflection.getCallerClass(frame);
while (c != null && !(c.getClassLoader() instanceof GroovyClassLoader)) {
    frame++;
    c = Reflection.getCallerClass(frame);
    println c
}

println Reflection.getCallerClass(1).classes;