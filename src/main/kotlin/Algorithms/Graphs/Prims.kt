package Algorithms.Graphs

import java.util.*

class Prims(private val vertices: Int) {
    private val adjacencyList: Array<MutableList<Pair<Int, Int>>> = Array(vertices) { mutableListOf() }

    fun addEdge(src: Int, dest: Int, weight: Int) {
        adjacencyList[src].add(Pair(dest, weight))
        adjacencyList[dest].add(Pair(src, weight)) // For undirected graph
    }

    fun primMST() {
        val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
        val visited = BooleanArray(vertices) { false }

        val parent = IntArray(vertices) { -1 } // To store the parent of each vertex in MST
        val key = IntArray(vertices) { Int.MAX_VALUE } // To store the key (weight) of each vertex

        key[0] = 0
        priorityQueue.add(Pair(0, key[0]))

        while (priorityQueue.isNotEmpty()) {
            val (currentVertex, _) = priorityQueue.poll()
            visited[currentVertex] = true

            for ((neighbor, weight) in adjacencyList[currentVertex]) {
                if (!visited[neighbor] && weight < key[neighbor]) {
                    parent[neighbor] = currentVertex
                    key[neighbor] = weight
                    priorityQueue.add(Pair(neighbor, key[neighbor]))
                }
            }
        }

        println("Edges of Minimum Spanning Tree:")
        for (i in 1 until vertices) {
            println("Edge: ${parent[i]} - $i  Weight: ${key[i]}")
        }
    }
}

fun main() {
    val graph = Prims(5)
    graph.addEdge(0, 1, 2)
    graph.addEdge(0, 3, 6)
    graph.addEdge(1, 2, 3)
    graph.addEdge(1, 3, 8)
    graph.addEdge(1, 4, 5)
    graph.addEdge(2, 4, 7)
    graph.addEdge(3, 4, 9)

    graph.primMST()
}
