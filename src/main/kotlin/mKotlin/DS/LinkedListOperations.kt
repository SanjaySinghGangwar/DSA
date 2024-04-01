package mKotlin.DS

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedListOperations {
    private var head: Node? = null

    fun insertFirst(data: Int) {
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }

    fun deleteFirst() {
        if (head != null) {
            head = head?.next
        }
    }

    fun insertLast(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        var last = head
        while (last?.next != null) {
            last = last.next
        }
        last?.next = newNode
    }

    fun deleteLast() {
        if (head == null || head?.next == null) {
            head = null
            return
        }
        var secondLast = head
        while (secondLast?.next?.next != null) {
            secondLast = secondLast.next
        }
        secondLast?.next = null
    }

    fun display() {
        var current = head
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
        println()
    }
}

fun main() {
    val linkedList = LinkedListOperations()
    linkedList.insertLast(1)
    linkedList.insertLast(2)
    linkedList.insertLast(3)
    linkedList.insertFirst(0)
    linkedList.display()
    linkedList.deleteFirst()
    linkedList.display()
    linkedList.deleteLast()
    linkedList.display()
}