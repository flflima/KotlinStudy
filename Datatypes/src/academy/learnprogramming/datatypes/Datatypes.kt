package academy.learnprogramming.datatypes

import academy.learnprogramming.java.Dummy
import java.math.BigDecimal

fun main(args: Array<String>) {
    val teste = 10
    println("Variavel teste eh um Int? ${teste is Int}")



    val myCharAsInt = 65
    println("My Int $myCharAsInt as Char is '${myCharAsInt.toChar()}'")


    val isVacation = false
    val vacations = Dummy().checkVacationMessage(isVacation)
    println(vacations)




    //////////////////



    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayListOf<Long>(1, 2, 3)

//    longs1[3] = 10
    longs2.add(99)

    println(longs1 is Array<Long>)
    println(longs2 is ArrayList<Long>)


    val someArray = Array(6) { i -> i * 2 }
    for (el in someArray) {
        println(el)
    }


    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (el in mixedArray) {
        println(el)
    }

//    val arrayOfInt = arrayOf(1, 22, 33, 3334)
    val arrayOfInt = intArrayOf(1, 22, 33, 3334)
    Dummy().printNumbers(arrayOfInt)


    var someOtherArray = IntArray(10)
    for (el in someOtherArray) {
        println(el)
    }

    Dummy().printNumbers(someArray.toIntArray())
}