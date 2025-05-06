/** Polimorfizm */

class Human {
    protected def dateOfBirth = "1987-07-17"
    protected def lastName = "Nowak"

    protected def getHumanData() {
        "Jestem ${this.lastName}, urodzony: $dateOfBirth"
    }

    String toString() {
        return getHumanData()
    }
}

class Worker extends Human {
    private def position = "Java Developer"

    String toString() {
        "${getHumanData()} stanowisko: $position"
    }
}

class Main {
    static def show(Human human) {
        println(human)
    }
}

Main.show(new Worker())