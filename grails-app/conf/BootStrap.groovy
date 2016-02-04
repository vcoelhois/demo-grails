import demograils.Customer

class BootStrap {

    def init = { servletContext ->
        (1..10).each {
            new Customer([name       : "Cliente ${it}",
                          email      : "email${it}@test.com",
                          status     : "ENABLED",
                          contactName: "Contato ${it}"]).save(failOnError: true)
        }
    }
    def destroy = {
    }
}
