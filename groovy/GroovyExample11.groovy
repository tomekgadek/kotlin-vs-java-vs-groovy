/** Interfejs */

interface Controllable {
    int STRICT = 0
    int RELAXED = 1

    void setMode(int level);
}

class Security implements Controllable {
    private int level

    void setMode(int level) {
        this.level = level
    }

    String toString() {
        "Level: ${this.level}"
    }
}

Controllable controllable = new Security()
controllable.setMode(Controllable.STRICT)

println(controllable)
