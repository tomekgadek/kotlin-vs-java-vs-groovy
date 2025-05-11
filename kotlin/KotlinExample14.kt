/** Listy */

fun main() {
    val cars = mutableListOf("Volvo", "BMW", "Ford", "Mazda")

    println("Cars: $cars")

    for(i:Int in cars.indices) {
        val newCar : String = "_" + cars[i] + "_"
        cars[i] = newCar
    }

    println("Cars: $cars")

    for(car in cars) {
        println ("Car: $car")
    }
}