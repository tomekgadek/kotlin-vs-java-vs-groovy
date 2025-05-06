/** Polimorfizm */

class Human {
    protected String dateOfBirth = "1987-07-17";
    protected String lastName = "Nowak";

    protected String getHumanData() {
        return "Jestem " + this.lastName + ", urodzony: " + dateOfBirth;
    }

    public String toString() {
        return getHumanData();
    }
}

class Worker extends Human {
    private String position = "Java Developer";

    public String toString() {
        return getHumanData() + " " + "stanowisko: " + position;
    }
}

class Main {
    static void show(Human human) {
        System.out.println(human);
    }

    public static void main(String[] args) {
        show(new Worker());
    }
}