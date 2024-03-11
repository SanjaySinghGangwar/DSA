package DS

class StackOperations {
    private val stackArray = ArrayList<Int>()

    fun push(item: Int) {
        stackArray.add(item)
    }

    fun pop(): Int? {
        if (isEmpty()) {
            println("Stack is empty")
            return null
        }
        val poppedItem = stackArray.removeAt(stackArray.size - 1)
        return poppedItem
    }

    fun peek(): Int? {
        if (isEmpty()) {
            println("Stack is empty")
            return null
        }
        return stackArray[stackArray.size - 1]
    }

    fun isEmpty(): Boolean {
        return stackArray.isEmpty()
    }

    fun display() {
        if (isEmpty()) {
            println("Stack is empty")
            return
        }
        println("Stack:")
        for (i in stackArray.size - 1 downTo 0) {
            println(stackArray[i])
        }
    }
}

fun main() {
    val stack = StackOperations()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.display()
    println("Peek: ${stack.peek()}")
    println("Pop: ${stack.pop()}")
    stack.display()
    println("Is stack empty? ${stack.isEmpty()}")
}
