package Algorithms.Others

fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (arr[mid] == target)
            return mid

        if (arr[mid] < target)
            left = mid + 1
        else
            right = mid - 1
    }
    return -1
}

fun main() {
    val arr = intArrayOf(2, 3, 4, 10, 40)
    val target = 10
    val result = binarySearch(arr, target)
    if (result == -1)
        println("Element not present in array")
    else
        println("Element found at index $result")
}