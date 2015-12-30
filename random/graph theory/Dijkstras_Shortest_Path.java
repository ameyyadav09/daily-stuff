import java.util.*;
 
public class Dijkstras_Shortest_Path
{
    private int          distances[];
    private Set<Integer> settled;
    private Set<Integer> unsettled;
    private int          number_of_nodes;
    private int          adjacencyMatrix[][];
 
    public Dijkstras_Shortest_Path(int number_of_nodes) {
        this.number_of_nodes = number_of_nodes;
        distances = new int[number_of_nodes + 1];
        settled = new HashSet<Integer>();
        unsettled = new HashSet<Integer>();
        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
    }
 
    public void dijkstra_algorithm(int adjacency_matrix[][], int source) {
        int evaluationNode;
        for (int i = 1; i <= number_of_nodes; i++)
            for (int j = 1; j <= number_of_nodes; j++)
                adjacencyMatrix[i][j] = adjacency_matrix[i][j];
 
        for (int i = 1; i <= number_of_nodes; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
 
        unsettled.add(source);
        distances[source] = 0;
        while (!unsettled.isEmpty()) {
            evaluationNode = getNodeWithMinimumDistanceFromUnsettled();
            unsettled.remove(evaluationNode);
            settled.add(evaluationNode);
            evaluateNeighbours(evaluationNode);
        }
    }
 
    private int getNodeWithMinimumDistanceFromUnsettled() {
        int min;
        int node = 0;
 
        Iterator<Integer> iterator = unsettled.iterator();
        node = iterator.next();
        min = distances[node];
        for (int i = 1; i <= distances.length; i++) {
            if (unsettled.contains(i)) {
                if (distances[i] <= min) {
                    min = distances[i];
                    node = i;
                }
            }
        }
        return node;
    }
 
    private void evaluateNeighbours(int evaluationNode) {
        int edgeDistance = -1;
        int newDistance = -1;
 
        for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++) {
            if (!settled.contains(destinationNode)) {
                if (adjacencyMatrix[evaluationNode][destinationNode] != Integer.MAX_VALUE) {
                    edgeDistance = adjacencyMatrix[evaluationNode][destinationNode];
                    newDistance = distances[evaluationNode] + edgeDistance;
                    if (newDistance < distances[destinationNode]) {
                        distances[destinationNode] = newDistance;
                    }
                    unsettled.add(destinationNode);
                }
            }
        }
    }
 
    public static void main(String [] arg) {
        int adjacency_matrix[][];
        int number_of_vertices;
        int source = 0, destination = 0;
        Scanner scan = new Scanner(System.in);
        int tests = Integer.parseInt(scan.nextLine());

        for ( int x = 0; x < tests; x++ ) {
        // System.out.println("Enter the number of vertices");
            number_of_vertices = Integer.parseInt(scan.next());
            adjacency_matrix = new int[number_of_vertices + 1][number_of_vertices + 1];
            //taking input for n, m
            int m = Integer.parseInt(scan.next());
            for ( int i = 0; i < m; i++) {
                int val1 = Integer.parseInt(scan.next());
                int val2 = Integer.parseInt(scan.next());
                adjacency_matrix[val1][val2] = 1;
                adjacency_matrix[val2][val1] = 1;
            }
            // System.out.println("Enter the Weighted Matrix for the graph");
            for (int i = 1; i <= number_of_vertices; i++) {
                for (int j = 1; j <= number_of_vertices; j++) {
                    if (adjacency_matrix[i][j] == 0) {
                        adjacency_matrix[i][j] = Integer.MAX_VALUE;
                    }
                }
            } 
            // System.out.println("Enter the source ");
            source = Integer.parseInt(scan.next()); 
 
            Dijkstras_Shortest_Path dijkstrasAlgorithm = new Dijkstras_Shortest_Path(
                    number_of_vertices);
            dijkstrasAlgorithm.dijkstra_algorithm(adjacency_matrix, source);
 
            for (int i = 1; i <= dijkstrasAlgorithm.distances.length - 1; i++) {
                if ( i != source) {
                    if (dijkstrasAlgorithm.distances[i] == Integer.MAX_VALUE)
                        System.out.print("-1 ");
                    else
                        System.out.print(dijkstrasAlgorithm.distances[i]*6 + " ");
                }
            }
        }
        scan.close();
    }
}