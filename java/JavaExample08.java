/** Dziedziczenie */

class Human {
    protected String dateOfBirth = "1987-07-17";
    protected String lastName = "Nowak";

    public String toString() {
        return "Jestem " + this.lastName + " urodzony: " + dateOfBirth;
    }
}

class Worker extends Human {
    private String position = "Java Developer";

    public String toString() {
        return "Jestem " + this.lastName + " urodzony: " + dateOfBirth + " " + "stanowisko: " + position;
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println(new Human());
        System.out.println(new Worker());
    }
}