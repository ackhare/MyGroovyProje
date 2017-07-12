package Operators

/**
 * Created by chetan on 23/3/17.
 */
class UserDemo {
    Long id
    String name
}

def user = new UserDemo(id: 1, name: 'Alex')
assert user[0] == 1
assert user[1] == 'Alex'
user[1] = 'Bob'
assert user.name == 'Bob'
