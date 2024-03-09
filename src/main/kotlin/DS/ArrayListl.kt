package DS

class ArrayListl {
    var list = ArrayList<Int>()
    fun main() {
        list.add(1231)
        list.add(23)

        list.add(1011)

        println("List Before sorting :: " + list.toSortedSet())
        println("List After sorting :: " + sortList(list))

    }

    private fun sortList(list: ArrayList<Int>): ArrayList<Int> {
        val finalList = ArrayList<Int>()
        for (i in list.indices) {
            if (finalList.isEmpty()) {
                finalList.add(list[i])
            } else {
                for (j in finalList.indices) {
                    if (list[i] > finalList[j]) {
                        finalList.add(list[i])
                    } else {
                    }
                }

            }
            println("List is " + finalList)
        }
        return finalList
    }


    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numIndexMap = HashMap<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]
            println("complement :: $complement")
            println("numIndexMap :: $numIndexMap")

            if (numIndexMap.containsKey(complement)) {
                println("if")
                return intArrayOf(numIndexMap[complement]!!, i)
            }
            numIndexMap[nums[i]] = i
        }

        throw IllegalArgumentException("No two sum solution")
    }

    fun removeDuplicates(arr: IntArray, n: Int): Int {
        // Return, if array is empty or
        // contains a single element
        if (n == 0 || n == 1) return n

        val temp = IntArray(n)


        // Start traversing elements
        var j = 0
        for (i in 0..<n - 1)  // If current element is not equal to next
        // element then store that current element
            if (arr[i] != arr[i + 1]) temp[j++] = arr[i]


        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1]


        // Modify original array
        for (i in 0..<j) arr[i] = temp[i]

        return j
    }

    fun isPalindrome(x: Int): Boolean {
        return x.toString().reversed() == x.toString()
    }
}