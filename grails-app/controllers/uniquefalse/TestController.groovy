package uniquefalse

import demo.User

class TestController {

    def index() {
        def user = new User(name: 'Iván', lastName: 'López')
        user.save(flush: true)

        render user.errors
    }
}
