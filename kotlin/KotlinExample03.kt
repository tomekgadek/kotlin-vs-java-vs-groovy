/** Instrukcje sterujące */

fun main() {
    var age: Int? = 18  // null ?

    age = age ?: 0

    if(age >= 18) {
        println("adult")
    } else {
        println("teenager")
    }
}