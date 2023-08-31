package main.java.Graphs;

import java.util.*;

public class test {
    class Edge{
        int destination;
        int weight;
        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }
    public class Solution {
        public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, int C) {
            List<Edge>[] graph = new ArrayList[C+1];
            for(int i =1; i<= C; i++) {
                graph[i] = new ArrayList<>();
            }

            for(ArrayList<Integer> edge: A) {
                int u = edge.get(0);
                int v = edge.get(1);
                int w = edge.get(2);
                graph[u].add(new Edge(v,w));
                graph[v].add(new Edge(u,w));
            }

            Set<Integer> faultyNodes = new HashSet<>();
            for(int node: B) {
                faultyNodes.add(node);
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.offer(new int[]{1,0});
            while(!pq.isEmpty()) {
                int[] curr = pq.poll();
                int node = curr[0];
                int weight = curr[1];

                if(node == C) {
                    return weight;
                }

                for(Edge neighbour: graph[node]) {
                    int nextNode = neighbour.destination;
                    int nextWeight = neighbour.weight;
                    if(!faultyNodes.contains(nextNode)){
                        pq.offer(new int[]{nextNode, weight+nextWeight});
                    }
                }
            }
            return -1;
        }
    }

}
