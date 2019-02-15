package academy.learnprogramming.loops

fun main() {
//    val range = 1..90
//
//    range.forEach { println("$it, ") }
//
//    println(43 in range)
//
//    val strRange = "A".."Z"
//
//    println(strRange)
//    println("B" in  strRange)
//
//    val charRange = 'a'..'z'
//    charRange.forEach { println(it) }

    /*val seasons = arrayOf("spring", "summer", "fall", "winter")
//    for (s in seasons) {
//        println(s)
//    }
    
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is $index") }

    val notASeason = "whatever" !in seasons
    println(notASeason)
    */


    for (i in 1..2) {
        println("i = $i")

        jlabel@ for (j in 3..5) {
            println("j = $j")

            for (k in 6..10) {
                println("k = $k")

                if (k == 8) {
                    break@jlabel
                }
            }
        }
    }

}