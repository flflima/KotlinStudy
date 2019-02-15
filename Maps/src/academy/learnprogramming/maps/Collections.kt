package academy.learnprogramming.maps

fun main() {
    val cars = mapOf(13 to Car("red", "Toyota", 1990),
        2 to Car("blue", "Ford", 2019),
        34 to Car("black", "Fiat", 2001))

    println(cars.toSortedMap())
    println(cars.values.sortedBy { it.year })
}