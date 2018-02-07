package demo

class User {

    String name
    String lastName

    static constraints = {
        name unique: false
    }
}
