package DS

import java.util.LinkedList

class Queue {
    val myQueue = QueueSchema<Int>()
    fun allOperations() {
        println("-----------------DS.Queue Starts-----------------")
        println("enqueue :: ${myQueue.enqueue(5)} " + myQueue.queue)
        println("enqueue :: ${myQueue.enqueue(10)} " + myQueue.queue)
        println("enqueue :: ${myQueue.enqueue(15)} " + myQueue.queue)

        println("Queue is :: " + myQueue.queue)
        // Dequeue items
        println("dequeue :: ${myQueue.dequeue()} " + myQueue.queue)
        println("dequeue :: ${myQueue.dequeue()} " + myQueue.queue)

        // Check the size of the queue
        println(myQueue.size())  // Output: 1

        // Dequeue remaining item
        println(myQueue.dequeue())  // Output: 15

        // Try to dequeue from an empty queue
        println(myQueue.dequeue())

        println("-----------------DS.Queue Ends-----------------")
    }
}

class QueueSchema<T> {
    val queue = LinkedList<T>()

    fun enqueue(item: T) {
        queue.add(item)
    }

    fun dequeue(): T? {
        return if (!isEmpty()) {
            queue.removeFirst()
        } else {
            println("Queue is empty")
            null
        }
    }

    fun isEmpty(): Boolean {
        return queue.isEmpty()
    }

    fun peek(): T {
        return queue.peek()
    }

    fun size(): Int {
        return queue.size
    }
}