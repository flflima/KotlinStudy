package academy.learnprogramming.trycatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    println(getNumber("10"))
    println(getNumber("19.99") ?:/* throw IllegalArgumentException("Not an Int")*/ "Not an Int")
    notImplementedYet()
}

fun getNumber(strNumber: String): Int? {
    return try {
                Integer.parseInt(strNumber)
            }/* catch (e: NumberFormatException) {
                0
            }*/ catch (e: NumberFormatException) {
                null
            } finally {
                println("I'm in the finally block")
            }
}

fun notImplementedYet(): Nothing {
    throw IllegalArgumentException("Implement me!")
}