package mKotlin

import mKotlin.DS.ArrayListl

fun main() {
//    val linkedList = LinkedList()
//    linkedList.allOperations()
//
//    val stackList=Stack()
//    stackList.allOperations()
//
//    val queue=Queue()
//    queue.allOperations()

    val arrayLos = ArrayListl()
//    arrayLos.main()

//   val data =arrayLos.twoSum(nums= intArrayOf(3,2,3), target = 6)
//    println("SANJAY :: "+data.asList())

    println("SANJAY :: "+ removeElement(intArrayOf(3,2,2,3),3))
}


fun removeElement(nums: IntArray, `val`: Int): Int {
    val newArray = nums.filter { it != `val` }.toIntArray()
    println("NEW ARRAY :: " + newArray.asList())
    val size = newArray.size - 1
    return size
}
