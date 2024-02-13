package Algorithms.Others

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0..<n - 1) {
        for (j in 0..<n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
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