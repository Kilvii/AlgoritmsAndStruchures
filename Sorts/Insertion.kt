package Sorts

class Insertion {
    fun insert(array: DoubleArray) {
        var steps = 0
        for (i in array.indices) {
            val key = array[i]
            var j = i
            while (j > 0 && array[j - 1] > key) {
                array[j] = array[j - 1]
                j -= 1
            }
            array[j] = key
            steps += 1
        }
        print(array)
        println()
        println("Iterations: $steps")
    }

    fun print(array: DoubleArray) {
        for (i in array.indices) {
            print(array[i].toString() + " ")
        }
    }
}