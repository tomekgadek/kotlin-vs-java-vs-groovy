/** Interfejs */

interface Controllable {
    int STRICT = 0;
    int RELAXED = 1;

    void setMode(int level);
}

class Security implements Controllable {
    private int level;

    public void setMode(int level) {
        this.level = level;
    }

    public String toString() {
        return "Level: " + this.level;
    }
}

class Main {

    public static void main(String[] args) {

        Controllable controllable = new Security();
        controllable.setMode(Controllable.STRICT);

        System.out.println(controllable);
    }
}