/** Typ wyliczeniowy */

enum class Colour(val code : String) {
    RED("#700"), GREEN("#070"), BLUE("#007");

    override fun toString() : String {
        return code
    }
}

fun main() {
    println("Red: ${Colour.RED}")
    println("Green: ${Colour.GREEN}")
    println("Blue: ${Colour.BLUE}")
}