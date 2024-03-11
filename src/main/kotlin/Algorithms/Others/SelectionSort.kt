package Algorithms.Others

import Algorithms.Helper.Helper.swap

fun selectionSort(arr: IntArray) {
    for (i in arr.indices) {
        var min = i
        for (j in i + 1..<arr.size) {
            if (arr[j] < arr[min]) {
                min = j
            }
        }
        //swap items
        swap(arr,i,min)
    }
}



fun main() {
    val arr = intArrayOf(64, 25, 12, 22, 11)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    selectionSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}