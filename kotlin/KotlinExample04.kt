/** Tablice */

fun main() {
    var vect = Array(2){0.0}
    var names = arrayOf("Atari", "Nintendo", "Sega")

    vect.set(0, 0.1)
    vect.set(1, 0.2)

    println("vect[0]  = " + vect.get(0));
    println("names[1] = " + names.get(1));
}
