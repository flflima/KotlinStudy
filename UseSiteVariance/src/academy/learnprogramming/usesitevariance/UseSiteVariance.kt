package academy.learnprogramming.usesitevariance

fun main() {
    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)


    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Car> = mutableListOf()
    copyCars(fords1, fords2)


}

fun copyCars(source: MutableList<out Car>, destination: MutableList<Car>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car {

}

class Toyota: Car() {

}

class Ford: Car() {

}