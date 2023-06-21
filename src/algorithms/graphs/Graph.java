package algorithms.graphs;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void addEdge(int source, int destination){
        adjacencyList.get(source).add(destination);
        }


    /**
     * method to get a topological sorting of the given graph.
     */

    public void generateToplogicalSort(){

        List<Integer>result = new ArrayList<>();


        boolean[] visited= new boolean[vertices];

        for (int vert = 0; vert < vertices; vert++) {
            if(!visited[vert]){
                topoUtil(vert,visited,result);
            }

        }
        // now that result if filled lets print it

        for(Integer vertex : result){
            System.out.print("--"+vertex);
        }
    }

    private void topoUtil(int vert, boolean[] visited, List<Integer> result) {
        visited[vert]=true;

        for(int child:adjacencyList.get(vert)){
            if(!visited[child]){
                topoUtil(child,visited,result);
            }
        }
        result.add(vert);
    }

    public void printGraph(){
        for (int i = 0; i < vertices; i++) {
            System.out.print("adjacency of "+i+" :");
            for(int j:adjacencyList.get(i)){
                System.out.print("--"+j);
            }
            
        }
    }

    public void dfsOfGraph(){
        boolean visited[]= new boolean[vertices];

        Arrays.fill(visited,false);
        List<Integer>dfsList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            if(!visited[i]){
                dfsUtil(i,visited,dfsList);
            }

        }
        System.out.println("\n printing the dfs of graph");
        for (Integer node :
                dfsList) {

            System.out.print(node+" --- ");
        }

    }

    private void dfsUtil(int i, boolean[] visited, List<Integer> dfsList) {
        visited[i]=true;

        dfsList.add(i);
        for(Integer child:adjacencyList.get(i)){
            if(!visited[child]){
                dfsUtil(child,visited,dfsList);
            }
        }
    }

    public static void runExample(){
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        g.generateToplogicalSort();
        g.dfsOfGraph();
    }

}
