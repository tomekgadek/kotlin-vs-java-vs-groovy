/** Klasa */

class Worker {
    private String name
    private int age

    private Worker() {
        this.age = 18
        this.name = "no name"
        println "Dziala konstruktor bezparametrowy!"
    }

    Worker(String name, int age) {
        this()     // Worker()
        this.name = name
        this.age = age
    }

    String toString() {
        return "Name: ${this.name}; Age: ${this.age}"
    }
}


def claudia = new Worker("Claudia Schiffer", 47)
println(claudia)

println("Age = ${claudia.age}")
