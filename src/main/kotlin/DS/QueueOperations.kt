package DS

class QueueOperations {
    private val queueArray = ArrayList<Int>()

    fun enqueue(item: Int) {
        queueArray.add(item)
    }

    fun dequeue(): Int? {
        if (isEmpty()) {
            println("Queue is empty")
            return null
        }
        val dequeuedItem = queueArray.removeAt(0)
        return dequeuedItem
    }

    fun peek(): Int? {
        if (isEmpty()) {
            println("Queue is empty")
            return null
        }
        return queueArray[0]
    }

    fun isEmpty(): Boolean {
        return queueArray.isEmpty()
    }

    fun display() {
        if (isEmpty()) {
            println("Queue is empty")
            return
        }
        println("Queue:")
        for (item in queueArray) {
            println(item)
        }
    }
}

fun main() {
    val queue = QueueOperations()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.display()
    println("Peek: ${queue.peek()}")
    println("Dequeue: ${queue.dequeue()}")
    queue.display()
    println("Is queue empty? ${queue.isEmpty()}")

    println("REVERSED :: "+ myAtoi("words and 987"))
}
fun myAtoi(s: String): Int {
    return if(s.first().isLetter()){
        0
    }else {
        try {
            val someting = s.filter { !it.isLetter() }
            return someting.replace(" ", "").toInt()
        } catch (e: Exception) {
            return 0
        }
    }
}


class Solution {
    fun myAtoi(s: String): Int {
        return if(s.first().isLetter()){
            0
        }else {
            try {
                val someting = s.filter { !it.isLetter() }
                return someting.replace(" ", "").toInt()
            } catch (e: Exception) {
                return 0
            }
        }
    }
}