package academy.learnprogramming.maps

fun main() {
    val immutableMap = mapOf(1 to Car("green", "Toyota", 2012))
    println(immutableMap)
    println(immutableMap.javaClass)

    val mutableMap = mutableMapOf(1 to Car("green", "Toyota", 2012))
    println(mutableMap)
    println(mutableMap.javaClass)

    val myCar = Car("blue", "Fiat", 1990)
    val (color) = myCar
    println("My car's color is $color")
}

data class Car(val color: String, val model: String, val year: Int) {

//    operator fun component1() = color

}