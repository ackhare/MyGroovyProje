/**
 * Created by chetan on 23/7/16.
 */

def str="chetan"
str.properties.each { println "$it.key -> $it.value" }

/*
class -> class java.lang.String
bytes -> [99, 104, 101, 116, 97, 110]
empty -> false

 */