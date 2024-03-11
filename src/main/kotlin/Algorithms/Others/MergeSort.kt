package Algorithms.Others

fun main() {
    val arr = intArrayOf(38, 27, 43, 3, 9, 82, 10)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    mergeSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}

fun mergeSort(arr: IntArray) {

    if(arr.size<=1) return

    val middle = arr.size/2
    val leftArray = arr.sliceArray(0 until middle)
    val rightArray = arr.sliceArray(middle until arr.size)

    mergeSort(leftArray)
    mergeSort(rightArray)

    merge(arr,leftArray,rightArray)
}

fun merge(arr: IntArray, leftArray: IntArray, rightArray: IntArray) {
    var mergedIndex = 0
    var lefIndex = 0
    var rightIndex = 0

    while (lefIndex < leftArray.size &&
        rightIndex < rightArray.size
    ) {
        if(leftArray[lefIndex]>rightArray[rightIndex]){
            arr[mergedIndex++] = rightArray[rightIndex++]
        }else{
            arr[mergedIndex++] = leftArray[lefIndex++]
        }
    }

    while (lefIndex<leftArray.size){
        arr[mergedIndex++] = leftArray[lefIndex++]
    }

    while (rightIndex<rightArray.size){
        arr[mergedIndex++] = rightArray[rightIndex++]
    }
}




