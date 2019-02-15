package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree))

    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)


    if (employeeFour is Employee) {
        val newEmployee = employeeFour as Employee
        println(newEmployee)
    }


    println(employeeOne)

    println("Teste com string template $employeeOne")





    //////////////////



    val numerador = 10.0
    val denomidador = 2.0
    println("O valor de $numerador dividido por $denomidador eh ${numerador/denomidador}")


    println("The employee's id is ${employeeOne.id}")


    println("""c:\home\folder""")

    println("""Teste
        |
        |teste
        |teste
    """.trimMargin())


/*    var number: Int
    number = 10
    number = 22

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"
//    employee1.id = 2222
//    employee1 = new Employee("John", 200)

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 150)
    } else {
        employee2 = Employee("Mike Watson", 400)
    }

    val employees: EmployeeSet

    val names = arrayListOf("John", "Mary", "Jane")
    println(names[1])*/
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id;
        }

        return false;
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }


}