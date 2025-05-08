/** Typ wyliczeniowy */

enum Colour {
    RED("#700"), GREEN("#070"), BLUE("#007");

    private String code;

    Colour(String code) {
        this.code = code;
    }

    public String toString() {
        return code;
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println("Red: " + Colour.RED);
        System.out.println("Green: " + Colour.GREEN);
        System.out.println("Blue: " + Colour.BLUE);
    }
}