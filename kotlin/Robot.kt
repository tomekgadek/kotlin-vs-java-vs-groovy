/** Robot */

data class Point(val x: Int, val y: Int)

interface ArtificialIntelligence {
    fun move(destination: Point)
    fun getPosition(): Point

    fun killEnemy(command: Byte = 0): Boolean {
        return checkAsimovLaws(command)
    }

    private fun checkAsimovLaws(command: Byte): Boolean {
        return command >= 0
    }
}

class Robot : ArtificialIntelligence {
    private var position: Point = Point(0, 0)

    override fun move(destination: Point) {
        position = destination
    }

    override fun getPosition(): Point {
        return position
    }
}

fun main() {
    val aiRobot = Robot()
    aiRobot.killEnemy(123.toByte())

    println("Works...")
}
