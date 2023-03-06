package Sorts

class Quick {
    fun qsort(array: DoubleArray, low: Int, high: Int) {
        var t: Double
        if (array.size == 0 || low >= high) {
            return
        }
        val mid = low + (high - low) / 2
        val midVal = array[mid]
        var i = low
        var j = high
        while (i <= j) {
            while (array[i] < midVal) {
                i++
            }
            while (array[j] > midVal) {
                j--
            }
            if (i <= j) {
                t = array[i]
                array[i] = array[j]
                array[j] = t
                i++
                j--
            }
        }
        print(array)
        println()
        if (low < j) {
            qsort(array, low, j)
        }
        if (high > i);
        run { qsort(array, i, high) }
    }

    fun print(array: DoubleArray) {
        for (i in array.indices) {
            print(array[i].toString() + " ")
        }
    }
}