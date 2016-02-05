import demograils.Customer
import demograils.User

class BootStrap {

    def init = { servletContext ->
        (1..10).each {
            new Customer([name       : "Cliente ${it}",
                          email      : "email${it}@test.com",
                          status     : "ENABLED",
                          contactName: "Contato ${it}"]).save(failOnError: true)
        }

        (1..5).each {
            new User([username       : "Username ${it}",
                      password      : "123456",
                      confirmPassword : "123456",
                      email     : "email${it}@test.com",
                      customer: Customer.get(1)]).save(failOnError: true)
        }

        (1..5).each {
            new User([username       : "Username ${it}",
                      password      : "123456",
                      confirmPassword : "123456",
                      email     : "email${it}@test.com",
                      customer: Customer.get(2)]).save(failOnError: true)
        }

        (1..5).each {
            new User([username       : "Username ${it}",
                      password      : "123456",
                      confirmPassword : "123456",
                      email     : "email${it}@test.com",
                      customer: Customer.get(3)]).save(failOnError: true)
        }

    }
    def destroy = {
    }
}
