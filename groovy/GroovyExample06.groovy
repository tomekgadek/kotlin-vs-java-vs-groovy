/** Funkcje */

def avg = average([1.0, 2.0, 3.0] as double[])
printf "AVG = ${avg}"

static def average(double[] digits) {

    def sum = 0.0

    for(digit in digits) {
        sum = sum + digit
    }

    sum / digits.length     // == return sum / digits.length
}
