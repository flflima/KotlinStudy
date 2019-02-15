package academy.learnprogramming.generics

fun main() {
    val l1 = listOf("One")
    printAll(l1)

    val l2 = listOf(1, 2 , 3)
    printAll(l2)
}

fun <T> printAll(lists: List<T>) {
    for (str in lists) {
        println(str)
    }
}