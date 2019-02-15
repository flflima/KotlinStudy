package academy.leanrprogramming.lists

fun main() {

    val strings = listOf("spring", "summer", "winter", "fall")
    val colorList = listOf("black", "white", "red", "red")

    println(strings.last())
    println(strings.asReversed())

    println(strings.getOrNull(10) ?: "Vixeeee")


    println(strings + colorList)
    println(colorList.distinct())
    println(strings.union(colorList))
}