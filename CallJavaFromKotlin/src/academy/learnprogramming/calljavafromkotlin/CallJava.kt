package academy.learnprogramming.calljavafromkotlin

import academy.learnprogramming.java.Car

fun main() {
    val car = Car("blue", "Toyota", 2015)
    car.color = null
    println(car)

    car.variableMethod(5, "hello", "world")

    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings)


    println("x = ${Car.x}")
    println(Car.xString())
}
