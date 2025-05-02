/** Funkcje */

class Main {

    public static void main(String[] args) {

        double avg = average(new double[]{1.0, 2.0, 3.0});
        System.out.println("AVG = " + avg);
    }

    private static double average(double[] digits) {

        double sum = 0.0;

        for(double digit: digits) {
            sum = sum + digit;
        }

        return sum / digits.length;
    }
}