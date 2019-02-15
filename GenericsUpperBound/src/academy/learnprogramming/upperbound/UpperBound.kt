package academy.learnprogramming.upperbound

fun main() {

    val ints = listOf(1, 2, 3, 4)
    val shorts: List<Short> = listOf(5, 6, 7, 8)

    convertToInt(shorts)
}

fun <T: Number> convertToInt(collection: List<T>) {
    for (i in collection) {
        println("${i.toInt()}")
    }
}