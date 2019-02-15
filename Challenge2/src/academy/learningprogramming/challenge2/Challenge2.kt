package academy.learningprogramming.challenge2

fun main(args: Array<String>) {
    // 1
//    val f1 = -3847.384f
//    val f2:Float = -3847.384f

    // 2

    val f1: Float? = -3847.384f
    val f2: Float? = -3847.384f

    // 3
    val shortArr = ShortArray(5) { i -> (i + 1).toShort()}

    for (s in shortArr) {
        println(s)
    }

    // 4
    val nullableInts = Array<Int?>(40) { i -> (i + 1) * 5 }
    for (i in nullableInts) {
        println(i)
    }

    // 5
    val charArr = charArrayOf('a', 'b', 'c')
//    Dummy().method1(charArr)

    // 7
    val x: String? = "I AM IN UPPERCASE"
//    val x2 = x?.toLowerCase() ?: "I give up!"
//    println(x2)

    // 8
    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    // 9
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}