/** Funkcje */

fun main() {

    val avg = average(arrayOf(1.0, 2.0, 3.0))
    println("AVG = $avg")
}

fun average(digits: Array<Double>) : Double {

    var sum = 0.0

    for(digit in digits) {
        sum = sum + digit
    }

    return sum / digits.size
}