package academy.learnprogramming.`when`

fun main() {
    val num = 600

    when(num) {
        100, 600 -> println("100")
        200 -> println("200")
        else -> println("Boohoo")
    }

    val obj1: Any = "hello"
    val obj2: Any = 10
    val check = obj1

    when (check) {
        is String -> println("say $check")
        is Int -> println("count to $check")
    }

    val num2 = -50

    when {
        num > num2 -> println("num is greater then num2")
        num < num2 -> println("num is less than num2")
        else -> println("num and num2 are equal")
    }
}