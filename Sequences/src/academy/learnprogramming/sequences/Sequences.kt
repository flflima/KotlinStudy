package academy.learnprogramming.sequences

fun main() {

    val cars = mapOf(13 to Car("red", "Toyota", 1990),
        2 to Car("blue", "Ford", 2019),
        34 to Car("black", "Fiat", 2001))

    println(cars.asSequence().filter { it.value.model == "Ford" }.map { println(it); it.value.color }.toList())
}

data class Car(val color: String, val model: String, val year: Int) {

//    operator fun component1() = color

}