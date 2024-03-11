package Algorithms.Others

import Algorithms.Helper.Helper.swap

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

fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivot = partition(arr, low, high)
        quickSort(arr, low, pivot - 1)
        quickSort(arr, pivot + 1, high)
    }
}
