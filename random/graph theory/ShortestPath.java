import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class ShortestPath
{
    private int distances[];
    private ArrayList<Integer> visited;
    private Set<Integer> unvisited;
    private int number_of_nodes;
    private static int adjacencyMatrix[][];
 
    public ShortestPath(int number_of_nodes) {
        this.number_of_nodes = number_of_nodes;
        distances = new int[number_of_nodes + 1];
        visited = new ArrayList<Integer>();
        unvisited = new HashSet<Integer>();
        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
    }
 
    public void dijkstra_algorithm(int source) {
        int minNode;
 
        for (int i = 1; i <= number_of_nodes; i++) {
            distances[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= number_of_nodes; j++) {
                if(adjacencyMatrix[i][j] == 0) {
                    adjacencyMatrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
 
        unvisited.add(source);
        distances[source] = 0;
        while (!unvisited.isEmpty()) {
            minNode = extractMin();
            unvisited.remove(minNode);
            visited.add(minNode);
            pathSearch(minNode);
        }
    }
 
    private int extractMin() {
        int min;
        int node = 0;
 
        node = unvisited.iterator().next();
        min = distances[node];
        for (int i = 1; i <= distances.length; i++) {
            if (unvisited.contains(i)) {
                if (distances[i] <= min) {
                    min = distances[i];
                    node = i;
                }
            }
        }
        return node;
    }
 
    private void pathSearch(int minNode) {
        int edgeDistance = -1;
        int newDistance = -1;
        for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++) {
            if (!visited.contains(destinationNode)) {
                if (adjacencyMatrix[minNode][destinationNode] != Integer.MAX_VALUE) {
                    edgeDistance = adjacencyMatrix[minNode][destinationNode];
                    newDistance = distances[minNode] + edgeDistance;
                    if (newDistance < distances[destinationNode]) {
                        distances[destinationNode] = newDistance;
                        adjacencyMatrix[minNode][destinationNode] = Integer.MAX_VALUE;
                    }
                    unvisited.add(destinationNode);
                }
            }
        }
    }

    public static void main(String [] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int no_of_tests = Integer.parseInt(scan.nextLine());

        for ( int t = 0; t < no_of_tests; t++) {

            //number of vertices input
            int number_of_vertices = Integer.parseInt(scan.next());
            int number_of_edges = Integer.parseInt(scan.next());

            ShortestPath dijkstrasAlgorithm = new ShortestPath(number_of_vertices);

            //adjacency matrix input
            for ( int i = 1; i <= number_of_edges; i++) {
                int x = Integer.parseInt(scan.next());
                int y = Integer.parseInt(scan.next());
                int val = Integer.parseInt(scan.next());
                if (adjacencyMatrix[x][y] == 0) {
                    adjacencyMatrix[x][y] = val;
                    adjacencyMatrix[y][x] = val;
                }
                else if (val < adjacencyMatrix[x][y]) {
                    adjacencyMatrix[x][y] = val;
                    adjacencyMatrix[y][x] = val;
                }
            }

            int source = Integer.parseInt(scan.next());
            //calculating shortest path
            dijkstrasAlgorithm.dijkstra_algorithm(source);
            for (int i = 1; i <= number_of_vertices; i++) {
                if (i != source) {
                    if (dijkstrasAlgorithm.distances[i] == Integer.MAX_VALUE) {
                        System.out.print(-1+" ");
                    }
                    else
                        System.out.print(dijkstrasAlgorithm.distances[i]+" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}