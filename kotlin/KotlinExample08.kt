/** Dziedziczenie */

open class Human {
    protected var dateOfBirth = "1987-07-17"
    protected var lastName = "Nowak"

    override fun toString() : String {
        return "Jestem ${this.lastName} urodzony: $dateOfBirth"
    }
}

class Worker : Human() {
    private var position = "Java Developer"

    override fun toString() : String {
        return "Jestem ${this.lastName} urodzony: ${dateOfBirth} stanowisko: $position"
    }
}

fun main() {
    println(Human())
    println(Worker())
}