package Sorts

class BinarySearch {
    fun binarySearch(array: DoubleArray, key: Int): Double {
        var left = 0
        var right = array.size - 1
        var mid: Int
        var midVal: Double
        while (left <= right) {
            mid = (left + right) / 2
            midVal = array[mid]
            if (key < midVal) {
                right = mid - 1
            } else if (key > midVal) {
                left = mid + 1
            } else {
                println("Element found on " + mid + "index")
                return mid.toDouble()
            }
        }
        println("Element doesn't found")
        return (-1).toDouble()
    }
}