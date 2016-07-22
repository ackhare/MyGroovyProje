package Proxy

/**
 * Created by chetan on 22/7/16.
 */

/*
 Groovy Goodness: Use a Class by Proxy
http://mrhaki.blogspot.in/2010/07/groovy-goodness-use-class-by-proxy.html


In the groovy.util package we find the Proxy class.
We can use this class to create a proxy for another object.
All methods calls to the proxy object are redirected to the original object,
instead for the methods we override in the proxy class:
 */
class User {
    String name
    String email
    String password

    String displayName() { name }
}

class UserProxy extends groovy.util.Proxy {
    List fields

    // Override getProperty for custom behavior by the proxy.
    Object getProperty(String propertyName) {
        if (propertyName in fields) {
            getAdaptee().getProperty(propertyName)
        } else {
            throw new MissingPropertyException("Unknown property $propertyName")
        }
    }
}

def user = new User(name: 'mrhaki', email: 'private@localhost', password: 'secret')
def userProxy= new UserProxy(fields: ['name']).wrap(user)  // Create proxy for user instance.

println 'mrhaki' == userProxy.name
try {
    userProxy.email
    assert false
} catch (MissingPropertyException e) {
    assert 'Unknown property email' == e.message
}
assert 'mrhaki' == userProxy.displayName()  // Use original method.