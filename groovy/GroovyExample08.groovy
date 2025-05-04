/** Dziedziczenie */

class Human {
    protected def dateOfBirth = "1987-07-17"
    protected def lastName = "Nowak"

    String toString() {
        return "Jestem ${this.lastName} urodzony: $dateOfBirth"
    }
}

class Worker extends Human {
    private def position = "Java Developer"

    String toString() {
        return "Jestem ${this.lastName} urodzony: ${dateOfBirth} stanowisko: $position"
    }
}


println(new Human())
println(new Worker())
