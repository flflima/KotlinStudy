package academy.learnprogramming.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2)

    println("Is hello1 structurally equal to hello2: ${hello1 == hello2}")

    var myNum: Int = 2988

    val anyNum: Any = "The Any type is the root of the Kotlin class hierarchy"

    if (anyNum is String) {
        println(anyNum.toUpperCase())
    }


    println("""   1
              *  11
              * 111
              *1111""".trimMargin("*"))

    println("""
              1
              1  11
              1 111
              11111""".trimMargin("1"))
}