package main.java.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int vertices;

//    Array of Lists for Adjacency List
    private LinkedList<Integer> adjacencyList[];

    // constructor
    @SuppressWarnings("unchecked") Graph(int V){
        System.out.println("debug");
        System.out.println("Graph constructor: creating"+ V + " number of adjacency List");
        vertices = V;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; ++i ) {
            adjacencyList[i] = new LinkedList();
            System.out.println(adjacencyList[i]);
        }

    }

    void addEdge(int vertex, int value) {
        System.out.println("In add Edge method : adding at vertex"+ vertex + " with value "+ value);
        adjacencyList[vertex].add(value);
    }

    void DFSUtil(int V, boolean visited[]) {
        visited[V] = true;
        System.out.print(V+"-> ");

        // recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adjacencyList[V].listIterator();
        while (i.hasNext()) {

            int n = i.next();

            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {

        boolean visited[] = new boolean[vertices];
        DFSUtil(v, visited);
    }
}
