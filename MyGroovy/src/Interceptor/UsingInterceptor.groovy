package Interceptor

/**
 * Created by chetan on 22/7/16.
 */

/*
http://mrhaki.blogspot.in/2009/11/groovy-goodness-intercept-methods-with.html
We can intercept method invocations in Groovy in several ways. One way is to write an
implementation for the Interceptor
interface. Next we create a ProxyMetaClass for the class we want
the methods to be intercepted for and assign the
interceptor to the ProxyMetaClass.
With the use() method we can run our methods and the interceptor is used for each
method invocation.
 */
class HelloInterceptor implements Interceptor {
    boolean invokeMethod = true

    boolean doInvoke() {
        invokeMethod
    }

    Object beforeInvoke(Object obj, String name, Object[] args) {
        // We don't want the shout() method to be executed.
        if (name == 'shout') {
            invokeMethod = false
        }
    }

    Object afterInvoke(Object obj, String name, Object[] args, Object result) {
        if (name == 'shout') {
            invokeMethod = true
            // Set an alternate result for the shout() method.
            result = "sssshhh... You don't have to shout."
        }
        result
    }
}
class Hello {
    String say() { "Hello Groovy" }
    String shout() { "HELLO GROOVY" }
}

// Create ProxyMetaClass and assign interceptor.
def proxy = ProxyMetaClass.getInstance(Hello)
def interceptor = new HelloInterceptor()
proxy.interceptor = interceptor

// Invoke Hello methods in use block so methods are intercepted.
proxy.use {
    def h = new Hello()
    println h.say()
    println h.shout()
}