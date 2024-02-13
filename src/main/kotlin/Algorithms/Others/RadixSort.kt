package Algorithms.Others

fun radixSort(arr: IntArray) {
    val maxElement = arr.maxOrNull() ?: return // Find the maximum element in the array

    // Perform counting sort for every digit
    var exp = 1
    while (maxElement / exp > 0) {
        countingSort(arr, exp)
        exp *= 10
    }
}

fun countingSort(arr: IntArray, exp: Int) {
    val n = arr.size
    val output = IntArray(n)
    val count = IntArray(10)

    // Store count of occurrences in count[]
    for (i in 0..<n) {
        val index = arr[i] / exp % 10
        count[index]++
    }

    // Change count[i] so that count[i] now contains actual position of this digit in output[]
    for (i in 1..<10) {
        count[i] += count[i - 1]
    }

    // Build the output array
    for (i in n - 1 downTo 0) {
        val index = arr[i] / exp % 10
        output[count[index] - 1] = arr[i]
        count[index]--
    }

    // Copy the output array to arr[] so that arr[] now contains sorted numbers according to current digit
    for (i in 0..<n) {
        arr[i] = output[i]
    }
}

fun main() {
    val arr = intArrayOf(170, 45, 75, 90, 802, 24, 2, 66)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    radixSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}