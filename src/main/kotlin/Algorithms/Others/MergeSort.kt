package Algorithms.Others

fun mergeSort(arr: IntArray) {
    if (arr.size <= 1) return

    val middle = arr.size / 2
    val leftArray = arr.sliceArray(0 until middle)
    val rightArray = arr.sliceArray(middle until arr.size)

    mergeSort(leftArray)
    mergeSort(rightArray)

    merge(arr, leftArray, rightArray)
}

fun merge(arr: IntArray, leftArray: IntArray, rightArray: IntArray) {
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0

    while (leftIndex < leftArray.size && rightIndex < rightArray.size) {
        if (leftArray[leftIndex] < rightArray[rightIndex]) {
            arr[mergedIndex++] = leftArray[leftIndex++]
        } else {
            arr[mergedIndex++] = rightArray[rightIndex++]
        }
    }

    while (leftIndex < leftArray.size) {
        arr[mergedIndex++] = leftArray[leftIndex++]
    }

    while (rightIndex < rightArray.size) {
        arr[mergedIndex++] = rightArray[rightIndex++]
    }
}

fun main() {
    val arr = intArrayOf(38, 27, 43, 3, 9, 82, 10)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    mergeSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}
