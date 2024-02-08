package DS

import java.util.LinkedList

class LinkedList {
    var list = LinkedList<Int>()
    var listTwo = LinkedList<Int>()
    fun allOperations() {
        println("-----------------DS.LinkedList Starts-----------------")

        listTwo.add(-1)
        listTwo.add(-2)
        listTwo.add(-3)
        // insert like a stack
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        println("List before push "+list)
        list.push(10)
        println("List after push "+list)

        // add the item to index 51234
        list.add(0, 5)

        // remove the first index 1234
        println("List Before removal ::" + list)
        list.pop()

        //Note
        //The remove() and poll() methods differ only in their behavior when the queue is empty:
        // the remove() method throws an exception,
        // while the poll() method returns null.
        // The element() and peek() methods return, but do not remove, the head of the queue.

        println(" list.poll() :: " + list.poll())
        //println(" list.pollFirst() :: "+ list.pollFirst())
        //println(" list.pollLast() :: "+ list.pollLast())
        println(" list.remove() :: " + list.remove())
        //println(" list.removeLast() :: "+ list.removeLast())
        //println(" list.removeLast() :: "+ list.removeLast())
        println("List after removal ::" + list)

        // add item at last index
        list.addLast(5)

        // add item at first index
        list.addFirst(0)

        // checks for value contains or not
        println("Contains :: " + list.contains(4))

        //returns value at index
        println("Return value at index :: " + list[3])

        println(list)

        // Iterate by reverse order
        println("descendingIterator Iterate in reverse order")
        for (i in list.descendingIterator()) {
            println(" $i")
        }

        println("Iterator Iterate in Normal order")
        for (i in list.iterator()) {
            println(" $i")
        }

        // Note
        // Iterator is a universal interface used to traverse any collection,
        // while ListIterator is specific to lists and provides bidirectional iteration.
        // Iterator supports only forward iteration with next().
        // On the other hand,
        // ListIterator supports both forward and backward iteration with next() and previous()


        println("List Iterate in Normal order")
        for (i in list.listIterator()) {
            println(i)
        }

        //peek and peekFirst is same
        //peekLast Return last index
        println("list.peek() " + list.peek())
        println("list.peekFirst() " + list.peekFirst())
        println("list.peekLast() " + list.peekLast())

        // will return peekFirst and Peek means first index of list
        println("Element :: " + list.element())

        // Todo - need to know more about hashCode
        println("hashCode :: " + list.hashCode())

        // sorts and remove duplicate item
        println("SortedSet :: " + list.toSortedSet())

        //sort will only sort the item will never remove duplicate
        list.sort()
        println("Sort :: $list")

        //offer also add the item to end of list and have 2 more funtions
        println("offer :: " + list.offer(6))
        println("offerLast :: " + list.offerLast(7))
        println("offerLast :: " + list.offerFirst(-1))

        //Note ::
        // The difference is that offer() will return false
        // if it fails to insert the element on a size restricted Queue,
        // whereas add() will throw an IllegalStateException
        // Note Ended

        //union added uncommon item at end of list
        println("Union :: " + list.union(listTwo))

        //remove duplicate
        list.add(0)

        println("List before duplicate by :: $list")
        println("Remove duplicate by set :: " + list.toSet())
        println("List is empty :: ${list.isEmpty()}")

        //clear the list
        list.clear()
        println("List is cleared :: $list")
        println("List is empty :: ${list.isEmpty()}")


        println("-----------------DS.LinkedList Ends-----------------")
    }
}