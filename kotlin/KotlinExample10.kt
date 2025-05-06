/** Polimorfizm */

open class Human {
    protected var dateOfBirth : String = "1987-07-17"
    protected var lastName : String = "Nowak"

    protected fun getHumanData() : String {
        return "Jestem ${this.lastName}, urodzony: $dateOfBirth"
    }

    override fun toString() : String {
        return getHumanData()
    }
}

class Worker : Human() {
    private var position = "Java Developer"

    override fun toString() : String {
        return "${getHumanData()} stanowisko: $position"
    }
}

fun show(human : Human) {
    println(human)
}

fun main() {
    show(Worker())
}