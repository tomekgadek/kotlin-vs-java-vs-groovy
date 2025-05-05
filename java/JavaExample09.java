/** Kompozycja */

class Engine {
}

class Wheel {
}

class Car {
    private Engine engine;
    private Wheel wheel;

    public Car() {
        this.engine = new Engine();
        this.wheel = new Wheel();
    }
}

class Main {

    public static void main(String[] args) {
        new Car();
    }
}