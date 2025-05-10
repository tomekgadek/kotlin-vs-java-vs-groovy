/** Wyjątki */

class EmptyDataException extends Exception {
}

class Array {

    private static void testArray(int[] digits) throws EmptyDataException {
        if(digits == null || digits.length == 0) {
            throw new EmptyDataException()
        }

        // ...
    }
}


try {
    //Array.testArray(null)
    //Array.testArray([1, 2] as int[])
    Array.testArray([] as int[])
} catch(EmptyDataException e) {
    println("Empty data!")
} finally {
    println("Always show!")
}
    