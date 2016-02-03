package demograils

class Customer {

    String name
    boolean status
    String email
    String contactName

    static constraints = {
	name blank: false, nullable: false, minSize: 3, maxSize: 99
	status nullable: false
	email blank: false, nullable:false, unique: true, email: true, maxSize: 99
	contactName nullable: true, maxSize: 99
    }
}
