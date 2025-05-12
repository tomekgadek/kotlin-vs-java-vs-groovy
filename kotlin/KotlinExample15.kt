/** Mapy */

fun main() {
    val matrix = mapOf(100 to "Neo", 200 to "Morfeusz", 300 to "Trinity", 400 to "Apoc")

    println("Team size: " + matrix.size)

    println("Find by key: " + matrix[200])
    println("Find by key: " + matrix[0])

    matrix.forEach {
        println("${it.key} : ${it.value}")
    }
}
