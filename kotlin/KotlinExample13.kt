/** Wyjątki */

class EmptyDataException : Exception()

fun testArray(digits : IntArray?) {
    if(digits == null || digits.isEmpty()) {
        throw EmptyDataException()
    }

    // ...
}

fun main() {
    try {
        //testArray(null)
        //testArray(intArrayOf(1, 2))
        testArray(intArrayOf())
    } catch(e : EmptyDataException) {
        println("Empty data!")
    } finally {
        println("Always show!")
    }
}