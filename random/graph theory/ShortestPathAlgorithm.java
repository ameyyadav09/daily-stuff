import java.util.*;
 
public class ShortestPathAlgorithm
{
    private int number_of_nodes;
    private ArrayList<Integer> visited;
    private Set<Integer> minHeap;
    private static int adjacencyMatrix[][];
    private static char [] nodes;
    private static int [] path;
    private int distances[];
 
    public ShortestPathAlgorithm(int number_of_nodes) {
        this.number_of_nodes = number_of_nodes;
        nodes = new char[number_of_nodes+1];
        distances = new int[number_of_nodes + 1];
        visited = new ArrayList<Integer>();
        minHeap = new HashSet<Integer>();
        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
        path = new int [number_of_nodes+1];
    }

    private int extractMin() {
        int min;
        int node = 0;
 
        node = minHeap.iterator().next();
        min = distances[node];
        for (int i = 1; i < distances.length+1; i++) {
            if (minHeap.contains(i)) {
                if (distances[i] <= min) {
                    min = distances[i];
                    node = i;
                }
            }
        }
        return node;
    }

    private void getPath(int minNode) {
        int edge = -1;
        int temp = -1;
        for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++) {
            if (!visited.contains(destinationNode)) {
                if (adjacencyMatrix[minNode][destinationNode] != 99999) {
                    edge = adjacencyMatrix[minNode][destinationNode];
                    temp = distances[minNode] + edge;
                    if (temp < distances[destinationNode]) {
                        distances[destinationNode] = temp;
                        path[destinationNode] = minNode;
                    }
                    minHeap.add(destinationNode);
                }
            }
        }
    }

    public void dijkstra_algorithm(int [] [] adjacency_matrix, int source) {
        int minNode; 
        for (int i = 1; i < number_of_nodes+1; i++) {
            distances[i] = 99999;
        }
        adjacencyMatrix = adjacency_matrix;

        minHeap.add(source);
        distances[source] = 0;
        while (!minHeap.isEmpty()) {
            minNode = extractMin();
            minHeap.remove(minNode);
            visited.add(minNode);
            getPath(minNode);
        }
    }

    public static void main(String [] arg) {
        int number_of_vertices;
        int source = 0;
        Scanner scan = new Scanner(System.in);

        number_of_vertices = Integer.parseInt(scan.nextLine());
        int adjacency_matrix[][] = new int [number_of_vertices+1][number_of_vertices+1];
        ShortestPathAlgorithm obj = new ShortestPathAlgorithm(number_of_vertices);

        char sourceNode = scan.nextLine().charAt(0);

        String st = scan.nextLine();
        String [] arr = st.substring(1,st.length()).split(",");
        for ( int i = 0; i < arr.length; i++) {
            nodes[i+1] = arr[i].charAt(0);
            if (nodes[i] == sourceNode) {
                source = i;
            }
        }

        for ( int i = 1; i < number_of_vertices+1; i++) {
            arr = scan.nextLine().split(",");
            for ( int j = 1; j < arr.length+1; j++) {
                int temp = Integer.parseInt(arr[j-1]);
                if (temp != 0) {
                    adjacency_matrix[i][j] = temp;
                }
                else adjacency_matrix[i][j] = 99999;
            }
        }

        //calculating the shortest path
        obj.dijkstra_algorithm(adjacency_matrix, source);

        for (int i = 1; i < obj.distances.length ; i++) {
            String str = ""+nodes[i];
            for(int j = i; j < number_of_vertices+1; ) {
                str = nodes[path[j]] +"->"+ str;
                j = path[j];
                if(j == source||j == 0) break;
            }
            if(obj.distances[i] == 0 || obj.distances[i] == 99999) {
                System.out.println(sourceNode+str.trim()+":"+obj.distances[i]);
            }
            else System.out.println(str+":"+obj.distances[i]);
        }
        scan.close();
    }
}