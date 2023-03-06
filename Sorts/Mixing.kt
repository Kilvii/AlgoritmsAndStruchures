package Sorts

class Mixing {
    fun mixing(array: DoubleArray) {
        var t: Double
        var steps = 0
        var left = 0
        var right = array.size
        while (left <= right) {
            var j = 0;
            for (i in 0 until (array.size - 1 - j)) {
                if (array[i] > array[i + 1]) {
                    t = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = t
                }
                j+=1;
            }
            left += 1
            steps += 1
            for (i in array.size - 1 downTo 1) {
                if (array[i] < array[i - 1]) {
                    t = array[i]
                    array[i] = array[i - 1]
                    array[i - 1] = t
                }
            }
            right -= 1
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