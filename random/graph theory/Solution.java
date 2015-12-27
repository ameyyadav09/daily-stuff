
import java.util.*;
public class Solution {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
			int nodes = Integer.parseInt(sc.next());
			int edges = Integer.parseInt(sc.next());
			int [][] array = new int[nodes][nodes];
			while (edges > 0) {
				int index1 = Integer.parseInt(sc.next());
				int index2 = Integer.parseInt(sc.next());
				array[index1-1][index2-1] = 1;
				edges--;
			}
			int start = Integer.parseInt(sc.next());
			bfs(nodes,array,start);
		
	}
	public static void bfs (int nodes, int [][] array, int start) {
		for( int dest = 1; dest <= nodes; dest++) {
			ArrayList<Integer> queue = new ArrayList<Integer>();
			int [] visited = new int[nodes];
			queue.add(start);
			visited[start-1] = 1;
			int count = 0;
			while(queue.size() != 0) {
				int element = queue.remove(0);
				if(element == dest) {
					System.out.println(dest + "" +count);
					break;
				}
				for ( int j = 0; j < nodes; j++) {
					if(array[element-1][j] == 1) {
						if(visited[j] == 0) {
							queue.add(j+1);
							visited[j] = 1;
						}
					}
				}
				count += 6;
			}
			if(count == 0) {
				System.out.println(-1);
			}
		}
	}
}