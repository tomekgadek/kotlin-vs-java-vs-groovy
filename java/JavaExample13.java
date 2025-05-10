/** Wyjątki */

class EmptyDataException extends Exception {
}

class Main {

    private static void testArray(int[] digits) throws EmptyDataException {
        if(digits == null || digits.length == 0) {
            throw new EmptyDataException();
        }

        // ...
    }

    public static void main(String[] args) {
        try {
            //testArray(null);
            //testArray(new int[]{1, 2});
            testArray(new int[]{});
        } catch(EmptyDataException e) {
            System.out.println("Empty data!");
        } finally {
            System.out.println("Always show!");
        }
    }
}