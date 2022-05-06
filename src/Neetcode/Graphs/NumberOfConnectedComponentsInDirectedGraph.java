package Neetcode.Graphs;

import java.util.HashSet;

public class NumberOfConnectedComponentsInDirectedGraph {
    public static int numberOfConnectedComponents(int n, int [][]edges){
        HashSet<Integer> set = new HashSet<>();
        int connectedComponents = 0;
        for(int i = 0; i<n; i++){
            if(!set.contains(i)){
                connectedComponents++;
                traverseGraph(i, set, edges);
            }
        }
        return connectedComponents;
    }
    public static void traverseGraph(int vertex, HashSet<Integer> set, int[][]edges){
        if(set.contains(vertex)){
            return;
        }
        set.add(vertex);

        for(int i = 0; i<edges.length; i++){
            int ver1 = edges[i][0];
            int ver2 = edges[i][1];

            if(ver1 == vertex){
                traverseGraph(ver2, set, edges);
            }
            if(ver2 == vertex){
                traverseGraph(ver1, set, edges);
            }
        }
    }
    public static void main(String[] args){
        int[][] edges = {
                {0,1},
                {1,2},
                {3,4}
        };

        System.out.println("Connected component: "+ numberOfConnectedComponents(5, edges));

        int[][] edges1 = {
                {0,1},
                {1,2},
                {2,3},
                {3,4}
        };

        System.out.println("Connected component: "+ numberOfConnectedComponents(5, edges1));
    }
}
