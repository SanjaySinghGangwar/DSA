package mKotlin.Algorithms.Others

import mKotlin.Algorithms.Helper.Helper.swap

fun main() {
    val arr = intArrayOf(1001,64, 34, 25, 999, 12, 22, 11, 90,1000)
    println("Array before sorting:")
    println(arr.joinToString(", "))

    bubbleSort(arr)

    println("Array after sorting:")
    println(arr.joinToString(", "))
}

fun bubbleSort(arr: IntArray) {
    for(i in arr.indices){
        for(j in 0..<arr.size-1-i){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1)
            }
        }
    }
}



