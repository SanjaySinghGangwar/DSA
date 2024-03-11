package Algorithms.Others

fun selectionSort(arr: IntArray) {
    val n = arr.size //size of array
    for (i in 0..<n - 1) { // first loop rill size || 0 to n-1
        var minIndex = i //update min index
        for (j in i + 1..<n) { //second loop will go || i+1 to n
            if (arr[j] < arr[minIndex]) {
                minIndex = j // update index of min
            }
        }
        // Swap arr[i] and arr[minIndex]
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
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