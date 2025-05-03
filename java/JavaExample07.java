/** Klasa */

class Worker {
    private String name;
    private int age;

    private Worker() {
        this.age = 18;
        this.name = "no name";
        System.out.println("Dziala konstruktor bezparametrowy!");
    }

    Worker(String name, int age) {
        this();     // Worker()
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.name + "; " + "Age: " + this.age;
    }
}

class Main {

    public static void main(String[] args) {

        Worker claudia = new Worker("Claudia Schiffer", 47);
        System.out.println(claudia);
    }
}