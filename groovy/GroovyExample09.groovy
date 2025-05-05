/** Kompozycja */

class Engine {
}

class Wheel {
}

class Car {
    private Engine engine
    private Wheel wheel

    Car() {
        this.engine = new Engine()
        this.wheel = new Wheel()
    }
}

new Car()
