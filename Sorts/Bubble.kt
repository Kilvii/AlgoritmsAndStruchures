package Sorts

class Bubble {
    var steps=0
    fun bubbleUp(array: DoubleArray) {
        var t: Double
        for (i in 0 until array.size - 1) {
            for (j in 0 until array.size - 1 - i) {
                if (array[j] > array[j + 1]) {
                    t = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = t
                }
                steps += 1
            }
        }
        print(array)
        println()
        println("Iterations: $steps")
    }

    fun bubbleDown(array: DoubleArray) {
        var t: Double
        for (i in 0 until array.size - 1) {
            for (j in 0 until array.size - 1 - i) {
                if (array[j] < array[j + 1]) {
                    t = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = t
                }
                steps += 1
            }
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