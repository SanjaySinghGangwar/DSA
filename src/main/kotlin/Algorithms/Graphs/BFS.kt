package Algorithms.Graphs

import java.util.*

class BFS(private val vertices: Int) {
    private val adjList: Array<MutableList<Int>> = Array(vertices) { mutableListOf() }

    fun addEdge(src: Int, dest: Int) {
        adjList[src].add(dest)
    }

    fun BFS(startingVertex: Int) {
        val visited = BooleanArray(vertices)
        val queue: Queue<Int> = LinkedList()

        visited[startingVertex] = true
        queue.add(startingVertex)

        while (queue.isNotEmpty()) {
            val currentVertex = queue.poll()
            print("$currentVertex ")

            val neighbors = adjList[currentVertex]
            for (neighbor in neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true
                    queue.add(neighbor)
                }
            }
        }
    }
}

fun main() {
    val graph = BFS(4)

    graph.addEdge(0, 1)
    graph.addEdge(0, 2)
    graph.addEdge(1, 2)
    graph.addEdge(2, 0)
    graph.addEdge(2, 3)
    graph.addEdge(3, 3)

    println("Breadth First Traversal starting from vertex 2:")
    graph.BFS(2)
}
