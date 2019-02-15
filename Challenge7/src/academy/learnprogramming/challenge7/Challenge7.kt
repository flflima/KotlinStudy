package academy.learnprogramming.challenge7

fun main() {
    val joe = Person("Joe", "Jones", 45)
//    val (fName, lName, age) = joe
//    println("fName = $fName, lName = $lName, age = $age")

    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 20)

    val namesMap = mapOf("Jones" to joe,
                        "Smith" to jane,
                        "Wilson" to mary,
                        "Adams" to john)

    //
    println(namesMap.filter { p -> p.key.toLowerCase().substring(0, 1) == "s" }.size)

    //
    val listOfNames = namesMap.map { Pair(it.value.lastName, it.value.firstName) }
    println(listOfNames)

    //
    namesMap.also {
        it.map { println("${it.value.firstName} is ${it.value.age} old.") }
    }

    //
    val list1 = listOf(1, 2, 5, 7, 8)
    val list2 = listOf(1, 4, 6, 7)
//    println(list1.union(list2))
//    println(list2 - list1)
    val list3 = list1.filter { it in list2 }
    println(list3)

    //
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<out T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}