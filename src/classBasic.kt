class Customer(name: String){
    init{
        println("Customer initalized with value) ${name}")
    }
    val customerKey = name.toUpperCase()
}

class Person(val name: String) {
    constructor(name: String, parent: Person) : this(name) {
//        parent.children.add(this)
    }

    constructor() : this("홍길동",Person()) {

    }
}

open class parent(firstName: String)

class child: parent("lee")
