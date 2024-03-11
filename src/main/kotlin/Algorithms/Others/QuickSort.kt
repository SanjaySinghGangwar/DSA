package Algorithms.Others

import Algorithms.Helper.Helper.swap

fun quickSort(array: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(array, low, high)
        quickSort(array, low, pivotIndex - 1)
        quickSort(array, pivotIndex + 1, high)
    }
}

fun partition(array: IntArray, low: Int, high: Int): Int {
    val pivot = array[high]
    var i = low - 1
    for (j in low..<high) {
        if (array[j] <= pivot) {
            i++
            swap(array, i, j)
        }
    }
    swap(array, i + 1, high)
    return i + 1
}

fun main() {
    val arr = intArrayOf(10, 7, 8, 9, 1, 5)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    quickSort(arr, 0, arr.size - 1)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}