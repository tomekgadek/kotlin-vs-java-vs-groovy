/** Interfejs */

interface Controllable {
    val STRICT : Int
    val RELAXED : Int

    fun setMode(level: Int)
}

class Security : Controllable {
    override val STRICT get() = 0
    override val RELAXED get() = 1

    private var level = RELAXED

    override fun setMode(level: Int) {
        this.level = level
    }

    override fun toString() : String {
        return "Level: ${this.level}"
    }
}

fun main() {
    val controllable : Controllable = Security()
    controllable.setMode(controllable.STRICT)

    println(controllable)
}