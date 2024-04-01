package mKotlin.Algorithms.Others

//fun insertionSort(array: IntArray) {
//    for (i in 1..< array.size) {
//        val key = array[i]
//        var j = i - 1
//        while (j >= 0 && array[j] > key) {
//            array[j + 1] = array[j]
//            j--
//        }
//        array[j + 1] = key
//    }
//}

fun main() {
    val arr = intArrayOf(12, 11, 13, 5, 6)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    insertionSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}

fun insertionSort(arr: IntArray) {
    for (i in 1..arr.size) {
        val key = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}


