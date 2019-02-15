package academy.learnprogramming.oochallenge

fun main() {
//    val bike = KotlinBicycle(100, 2, 22)
//    val mountainBike = KotlinMountainBike(19, 22, 23, 3)
//    val roadBike = KotlinRoadBike(10, 20, 33, 3)
//
//    bike.printDescription()
//    mountainBike.printDescription()
//    roadBike.printDescription()
//
//    val bike2 = KotlinBicycle(100, 2)
//    val mountainBike2 = KotlinMountainBike(19, 22, 23)
//    val roadBike2 = KotlinRoadBike(10, 20, 33)
//
//    bike2.printDescription()
//    mountainBike2.printDescription()
//    roadBike2.printDescription()

    val yellowMountainBike = KotlinMountainBike("yellow", 1, 1, 1)
    yellowMountainBike.printDescription()

    KotlinMountainBike.printAllColors()
}

open class KotlinBicycle (var cadence: Int, var speed: Int, var gear: Int  = 10) {

    fun applyBrake(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at speed of $speed.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int  = 10): KotlinBicycle(cadence, speed, gear) {

    var color = "grey"

    constructor (color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int  = 10):
        this(seatHeight, cadence, speed, gear) {
        println("The color received is $color")
        this.color = color
    }

    companion object {
        val availableColors = arrayOf("blue", "red", "white", "black", "green", "brown")

        fun printAllColors() {
            availableColors.forEach { println(it) }
        }
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches and it's $color.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int  = 10): KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire of $tireWidth mm.")
    }

}
