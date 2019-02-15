package academy.learnprogramming.lambda

fun main() {
//    run { println("Inside the lambda") }

    val randomNums = listOf(1, 22, 3, -333, 4390, 202)

    println(randomNums.minBy { r: Int -> r })
    println(randomNums.maxBy { it })

    run(::topLevel)

    println(countTo100())
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}

fun topLevel() {
    println("Hi!!!")
}


fun countTo100() =
        with(StringBuilder()) {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append("100")
            toString()
        }