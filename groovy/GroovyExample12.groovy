/** Typ wyliczeniowy */

enum Colour {
    RED("#700"), GREEN("#070"), BLUE("#007");

    private String code

    Colour(String code) {
        this.code = code
    }

    String toString() {
        this.code
    }
}

println "Red: ${Colour.RED}"
println "Green: ${Colour.GREEN}"
println "Blue: ${Colour.BLUE}"