package Sorts

class Merge {
    fun mergeSort(array: DoubleArray, n: Int) {
        if (n < 2) {
            return
        }
        val mid = n / 2
        val l = DoubleArray(mid)
        val r = DoubleArray(n - mid)
        for (i in 0 until mid) {
            l[i] = array[i]
        }
        for (i in mid until n) {
            r[i - mid] = array[i]
        }
        mergeSort(l, mid)
        mergeSort(r, n - mid)
        merge(array, l, r, mid, n - mid)
        print(array)
        println()
    }

    fun merge(array: DoubleArray, l: DoubleArray, r: DoubleArray, left: Int, right: Int) {
        var i = 0
        var j = 0
        var k = 0
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++]
            } else {
                array[k++] = r[j++]
            }
        }
        while (i < left) {
            array[k++] = l[i++]
        }
        while (j < right) {
            array[k++] = r[j++]
        }
    }

    fun print(array: DoubleArray) {
        for (i in array.indices) {
            print(array[i].toString() + " ")
        }
    }
}