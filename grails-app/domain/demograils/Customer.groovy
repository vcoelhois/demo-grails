package demograils

class Customer {

    String name
    String status
    String email
    String contactName

    static constraints = {
        name blank: false, nullable: false, minSize: 3, maxSize: 99
        status nullable: false, inList: ['ENABLED', 'DISABLED']
        email blank: false, nullable: false, unique: true, email: true, maxSize: 99
        contactName nullable: true, maxSize: 99
    }

    @Override
    String toString() {
        name
    }
}
