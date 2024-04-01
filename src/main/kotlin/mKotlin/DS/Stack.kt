package mKotlin.DS

import java.util.Stack

class Stack {
    val list = Stack<Int>()

    fun allOperations() {
        println("-----------------DS.Stack Starts-----------------")

        //adds to end of the item
        println("List before add() :: $list")
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        println("List after add() :: $list")

        //set will replace the index we are inserting it to
        println("List before set() :: $list")
        list.set(0, -1)
        println("List before set() :: $list")

        //adds in front of list
        println("List Before push :: $list")
        list.push(6)
        println("List after push :: $list")

        println("list.pop() :: " + list.pop())

        //remove will remove the item if present if not return false else true
        println("list.remove(-1) :: " + list.remove(-1))

        //peeks last item
        println("list.peek() :: " + list.peek())
        println("list.lastElement() :: " + list.lastElement())
        println("list.firstElement() :: " + list.firstElement())
        println("list.first() :: " + list.first())
        println("list.firstOrNull() :: " + list.firstOrNull())
        //will return -1 if nothing found else will return from end
        println("list.search() :: " + list.search(5))



        println("List is :: $list")

        println("iterator() :: ")
        for(i in list.iterator()){
            println(i)
        }

        // Note :: Reverse vs Reversed
        // Reversed is iterator it reverses and works as iterator
        // Reverse only reverse the list
        println("reversed() :: ")
        for(i in list.reversed()){
            println(i)
        }

        println("List.reverse() :: ${list.reverse()} :: " + list)

        println("List is Cleared :: ${list.clear()} :: " + list)

        println("-----------------DS.Stack Ends-----------------")
    }
}