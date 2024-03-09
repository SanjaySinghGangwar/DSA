/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

  class ListNode(var `val`: Int) {
      var next: ListNode? = null
  }

fun maxProfit(prices: IntArray): Int {
    var min = prices[0]
    for (i in prices.indices) {
        if (i != prices.lastIndex) {
            if (min < prices[i]) {
                min = prices[i]
            }
        }
    }

    val subList = prices.asList().subList(prices.indexOf(min), prices.size - 1)
    var max = subList[0]
    for (j in subList.indices) {
        if (max < subList[j]) {
            max = subList[j]
        }
    }

    return max - min
}
