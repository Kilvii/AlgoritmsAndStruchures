package Sorts

class Select {
    fun selectMin(array: DoubleArray) {
        var steps = 0
        var min: Int
        var t: Double
        for (i in 0 until array.size - 1) {
            min = i
            for (j in i + 1 until array.size) {
                if (array[j] < array[i]) {
                    min = j
                }
            }
            t = array[min]
            array[min] = array[i]
            array[i] = t
            steps += 1
        }
        print(array)
        println()
        println("Iterations: $steps")
    }

    fun selectMax(array: DoubleArray) {
        var steps = 0
        var max: Int
        var t: Double
        for (i in 0 until array.size - 1) {
            max = i
            for (j in i + 1 until array.size) {
                if (array[j] > array[i]) {
                    max = j
                }
            }
            t = array[max]
            array[max] = array[i]
            array[i] = t
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