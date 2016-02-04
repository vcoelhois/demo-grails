package demograils

class User {

    transient springSecurityService
    transient confirmPassword

    String username
    String password
    String email
    Customer customer

    static constraints = {
        username blank: false, nullable: false, minSize: 4, maxSize: 99
        password blank: false, nullable: false, validator: { password, obj, errors ->
            if (!obj.confirmPassword) {
                errors.rejectValue("confirmPassword", "user.confirmPassword.error.required")
            } else if(obj.confirmPassword != password) {
                errors.rejectValue("password", "user.password.error.mismatch.passwords")
            }
        }
        email blank: false, nullable: false, email: true, unique: ['customer']
        customer nullable: false
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService.encodePassword(password)
    }


}
