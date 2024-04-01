package mKotlin.Algorithms.Graphs

import java.util.*

class Dijkstra(private val vertices: Int) {
    private val adjacencyList: Array<MutableList<Pair<Int, Int>>> = Array(vertices) { mutableListOf() }

    fun addEdge(src: Int, dest: Int, weight: Int) {
        adjacencyList[src].add(Pair(dest, weight))
    }

    fun dijkstra(startingVertex: Int) {
        val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
        val distance = IntArray(vertices) { Int.MAX_VALUE }
        distance[startingVertex] = 0

        priorityQueue.add(Pair(startingVertex, 0))

        while (priorityQueue.isNotEmpty()) {
            val (currentVertex, currentDistance) = priorityQueue.poll()

            if (currentDistance > distance[currentVertex]) continue

            for ((neighbor, edgeWeight) in adjacencyList[currentVertex]) {
                val newDistance = currentDistance + edgeWeight
                if (newDistance < distance[neighbor]) {
                    distance[neighbor] = newDistance
                    priorityQueue.add(Pair(neighbor, newDistance))
                }
            }
        }

        println("Shortest distances from vertex $startingVertex:")
        for (i in 0 until vertices) {
            println("Vertex $i : Distance = ${distance[i]}")
        }
    }
}

fun main() {
    val graph = Dijkstra(5)
    graph.addEdge(0, 1, 4)
    graph.addEdge(0, 2, 1)
    graph.addEdge(1, 3, 1)
    graph.addEdge(2, 1, 2)
    graph.addEdge(2, 3, 5)
    graph.addEdge(3, 4, 3)

    val sourceVertex = 0
    graph.dijkstra(sourceVertex)
}