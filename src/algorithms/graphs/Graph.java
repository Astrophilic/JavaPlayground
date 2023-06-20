package algorithms.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private Integer vertices;
    private List<List<Integer>>adjacencyList;

    public Graph(Integer vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, boolean isDirected){

        adjacencyList.get(source).add(destination);
        if(!isDirected){
            adjacencyList.get(destination).add(source);
        }
    }
    public void printGraph(){
        for (int i = 0; i < vertices; i++) {
            System.out.print("adjacency of "+i+" :");
            for(int j:adjacencyList.get(i)){
                System.out.print("--"+j);
            }
            
        }
    }

    public static void runExample(){
        Graph graph = new Graph(5);
        graph.addEdge(0,1,false);
        graph.addEdge(0,2,false);
        graph.addEdge(1,2,false);
        graph.addEdge(3,4,false);
        graph.addEdge(3,1,false);
        graph.addEdge(4,2,false);
        graph.printGraph();

    }

}
