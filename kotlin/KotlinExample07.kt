import kotlin.properties.Delegates

/** Klasa */

class Worker private constructor() {

    private var name: String by Delegates.notNull()
    private var age: Int by Delegates.notNull()

    init {
        this.name = "no name"
        this.age = 18
        println("Dziala konstruktor bezparametrowy!")
    }

    constructor(name: String, age: Int) : this() /* Worker() */ {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "Name: $name; Age: $age"
    }
}

fun main() {

    val model = Worker("Claudia Schiffer", 47)
    println(model)
}