package Algorithms.Graphs

class Edge(val src: Int, val dest: Int, val weight: Int)

class Kruskals(private val vertices: Int, private val edges: List<Edge>) {
    private val parent = IntArray(vertices) { it }

    private fun find(node: Int): Int {
        if (parent[node] != node) {
            parent[node] = find(parent[node])
        }
        return parent[node]
    }

    private fun union(x: Int, y: Int) {
        val xParent = find(x)
        val yParent = find(y)
        parent[xParent] = yParent
    }

    fun kruskalMST() {
        val resultEdges = mutableListOf<Edge>()
        val sortedEdges = edges.sortedBy { it.weight }

        var edgeCount = 0
        var edgeIndex = 0

        while (edgeCount < vertices - 1 && edgeIndex < sortedEdges.size) {
            val edge = sortedEdges[edgeIndex]
            edgeIndex++

            val srcParent = find(edge.src)
            val destParent = find(edge.dest)

            if (srcParent != destParent) {
                resultEdges.add(edge)
                edgeCount++
                union(srcParent, destParent)
            }
        }

        println("Edges of Minimum Spanning Tree:")
        for (edge in resultEdges) {
            println("Edge: ${edge.src} - ${edge.dest}  Weight: ${edge.weight}")
        }
    }
}

fun main() {
    val edges = listOf(
        Edge(0, 1, 2),
        Edge(0, 3, 6),
        Edge(1, 2, 3),
        Edge(1, 3, 8),
        Edge(1, 4, 5),
        Edge(2, 4, 7),
        Edge(3, 4, 9)
    )

    val graph = Kruskals(5, edges)
    graph.kruskalMST()
}
