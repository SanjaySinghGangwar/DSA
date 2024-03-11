package Algorithms.Others

import kotlin.math.pow
import kotlin.math.roundToInt

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0..<n - 1) { // first loop will go by n-1
        for (j in 0..<n - i - 1) { // second loop will go by n-i-1
            if (arr[j] > arr[j + 1]) { // if(array[j] > array[j+1])
                val temp = arr[j] // swap two variables
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(64, 34, 25, 999,12, 22, 11, 90)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    bubbleSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}



