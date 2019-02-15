package academy.learnprogramming.functions

fun main() {
    println(labelMultiply(3, 4, "Result is:"))


    val emp = Employee(name = "jane")
    println(emp.toUpperCaseName())

    val car1 = Car("blue", "Toyota", 2019)
    val car2 = Car("green", "Toyota", 2019)
    val car3 = Car("red", "Ford", 2015)

//    printColors(car1, car2, car3)


    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)

    val lotsOfCars = arrayOf(*manyCars, Car("Yellow", "Camaro", 2010))
//    for (c in lotsOfCars) {
//        println(c)
//    }

    printColors(*lotsOfCars)


    val text = "hello world"
//    println(Utils().upperFirstAndLast(text))
    println(text.upperFirstAndLast())

}


fun String.upperFirstAndLast(): String {
    return this.substring(0, 1).toUpperCase() + this.substring(1, this.length - 1) +
            this.substring(this.length - 1).toUpperCase()
}

fun labelMultiply(op1: Int, op2: Int, label: String) =
        "$label ${op1 * op2}"

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println("Color: ${car.color}")
    }
}

class Employee(val name: String) {

    fun toUpperCaseName() = this.name.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int) {

}