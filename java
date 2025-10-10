import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Для неориентированного графа
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.printGraph();
    }
}
