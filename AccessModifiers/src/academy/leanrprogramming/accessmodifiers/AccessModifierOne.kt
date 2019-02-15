package academy.leanrprogramming.accessmodifiers

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println("My constant is = $MY_CONSTANT")


    val employee = EmployeeOne("John")
    employee.fullTime = true
    println(employee)

    val emp2 = EmployeeOne("Mary", false)
    println(emp2.firstName)
    println(emp2.fullTime)

    println(Demo().dummy)
}

/*
class EmployeeOne */
/*constructor*//*
(val firstName: String) {

//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }
    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }

    override fun toString(): String {
        return "EmployeeOne(firstName='$firstName', fullTime=$fullTime)"
    }


}*/
/*

class EmployeeOne (val firstName: String, val fullTime: Boolean = true) {
    override fun toString(): String {
        return "EmployeeOne(firstName='$firstName', fullTime=$fullTime)"
    }
}
*/

class EmployeeOne (val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Custom getter")
        return field
    }

    set(value) {
        println("Custom setter")
        field = value
    }

    override fun toString(): String {
        return "EmployeeOne(firstName='$firstName', fullTime=$fullTime)"
    }
}

class Demo {
    val dummy: String

    constructor() {
        this.dummy = "Hello"
    }
}
