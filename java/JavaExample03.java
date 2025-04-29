/** Instrukcje sterujące */

class Main {

    public static void main(String[] args) {
        Integer age = 18;   // null ?

        age = (age != null) ? age : 0;

        if(age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("teenager");
        }
    }
}