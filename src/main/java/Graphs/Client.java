package main.java.Graphs;

/*

graph = nodes + edges

directed and undirected graphs
directed -> obey the direction
undirected -> can go back and forth

adjacency list :
    {
        a: [b, c],
        b: [d],
        c: [b],
        d: []

    }


 */
public class Client {
    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");
        g.DFS(2);
    }
}
