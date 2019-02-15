package academy.leanrprogramming.accessmodifiers

fun main() {
    val car = Car("blue", "Toyota", 2015)
    println(car)

    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2)

    val car3 = car.copy()
    println(car3)
    println(car3 == car2)

    val car4 = car.copy(year = 2017)
    println(car4)

    println(car3 == car4)

}

data class Car(val color: String, val model: String, val year: Int) {

}