package mKotlin.Algorithms.Graphs

class DFS(private val vertices: Int) {
    private val adjList: Array<MutableList<Int>> = Array(vertices) { mutableListOf() }

    fun addEdge(src: Int, dest: Int) {
        adjList[src].add(dest)
    }

    fun DFSUtil(vertex: Int, visited: BooleanArray) {
        visited[vertex] = true
        print("$vertex ")

        val neighbors = adjList[vertex]
        for (neighbor in neighbors) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited)
            }
        }
    }

    fun DFS(startingVertex: Int) {
        val visited = BooleanArray(vertices)
        DFSUtil(startingVertex, visited)
    }
}

fun main() {
    val graph = DFS(4)

    graph.addEdge(0, 1)
    graph.addEdge(0, 2)
    graph.addEdge(1, 2)
    graph.addEdge(2, 0)
    graph.addEdge(2, 3)
    graph.addEdge(3, 3)

    println("Depth First Traversal starting from vertex 2:")
    graph.DFS(2)
}