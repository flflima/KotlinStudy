package academy.learnprogramming.inheritance

fun main() {
    val printer = LaserPrinter("Lexmark 1234", 110)
    printer.printModel()
    println(
        "the best selling price for a ${printer.modelName} is $${String.format("%.2f", printer.bestSellingPrice())}. " +
                "Its PPM is ${printer.ppm}"
    )


    SomethingElse("Hello World")
}

abstract class Printer(val modelName: String) {

    open fun printModel() {
        println("The printer is a $modelName")
    }

    abstract fun bestSellingPrice(): Double
}

class LaserPrinter(modelName: String, var ppm: Int) : Printer(modelName) {

//    val ppm = ppm

    override fun printModel() = println("The laser printer is a $modelName")

    override fun bestSellingPrice(): Double = 400.90

}


open class Something {

    val someProperty: String

    constructor(someProperty: String) {
        this.someProperty = someProperty

        println("Parent Constructor")
    }
}

class SomethingElse : Something {

    constructor(someProperty: String) : super(someProperty) {
        println("Child Constructor")
    }

}


/////

abstract class MyFirst

class MySecond : MyFirst(), MySubInterface {

    override val number
        get() = 25

    override fun hello() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun helloAgain() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface MyInterface {

    val number: Int

    fun hello()

}

interface MySubInterface : MyInterface {

    fun helloAgain()

}

// another module testing

fun testHelloWorld() {
    println("Hello World!")
}