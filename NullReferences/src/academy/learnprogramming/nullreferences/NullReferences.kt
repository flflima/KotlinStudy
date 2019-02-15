package academy.learnprogramming.nullreferences

fun main(args: Array<String>) {
    val str: String? = null

    println("Se String for nula: ${str?.toUpperCase()}")

    val str2 = str ?: "Default Value"

    println(str2)

//    str!!.toUpperCase()

    println("------------")
    str?.let { printText(it) }
    str2?.let { printText(it) }


    val str4 = str
    val newStr = "Not null!!"
    println(str4 == newStr)



    val nullableInts = arrayOfNulls<Int>(10)
    for (i in nullableInts) {
        println(i)
    }
}

fun printText(text: String) {
    println(text)
}