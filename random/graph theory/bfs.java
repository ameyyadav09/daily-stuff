import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
class Methods {
	private ArrayList<Integer> comp;
	private int [] visited;
	private int [] traverse;
	private ArrayList<Integer> node;
	private int size;
	private int count;
	private int source;
	private int dest;
	Methods(int num , int source, int destination) {
		node = new ArrayList<Integer>();
		comp = new ArrayList<Integer>();
		visited = new int[num + 1];
		traverse = new int [num];
		this.size = num ;
		this.source = source;
		dest = destination;
	}
	public int bfs (int [][] array) {
		int i , element;
		visited[source] = source;
		comp.add(source);
	  node.add(source);count++;
	  while (node.size() != 0) {
      element = node.remove(0);
      i = 1;
      // System.out.print(element + " ");
      count++;
      while (i <= size) {
        if (array[element][i] == 1) {
        	if(visited[i] == 0) {
            node.add(i);
      			visited[i] = 1;
      		}
      		comp.add(i);
        }
        i++;
      }
  	}
  	int count = 0;
  	// System.out.println(comp);
  	if(source != dest)
  		return comp.indexOf(dest);
  	else
  		for( i = 0; i < comp.size() ; i++) {
  			if(comp.get(i) == dest) {
  				count++;
  			}
  			if(count == 2) {
  				count = i;
  				break;
  			}
  		}
  		return count;
	}
	public int dfs(int [] [] array) {
		int i = source;
		// visited[source] = 1;
		node.add(source);comp.add(source);
		while(node.size() != 0) {
			i = node.get(0);
			visited[i] = 1;
			node.remove(0);
			int j = 1;
			while (j <= size) {
				if(array[i][j] == 1) {
					if(visited[j] != 1) {
						node.add(j);comp.add(j); }
				}
				array[i][j] = 0;j++;
			}
		}
		// System.out.println(comp);
		return comp.indexOf(dest) + 1;
	}
}
public class bfs {
	public static void main(String [] args) {
		int count = 0 , val1, val2;
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int [] array = new int[num];
		int [] [] inputarray = new int[num+1][num+1];
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			array[count] = Integer.parseInt(st.nextToken());
		}
		for( int i = 1; i <= num ; i++) {
			for( int j = 1; j <= num; j++) {
				inputarray[i][j] = Integer.parseInt(sc.next());
			}
		}
		int source = Integer.parseInt(sc.next());
		int destination = Integer.parseInt(sc.next());
		Methods mj = new Methods(num , source, destination);
		val1 = mj.bfs(inputarray);
		Methods mj2 = new Methods(num, source, destination);
		val2 = mj2.dfs(inputarray);
		if(val1 >= 0 && val2 >= 0) {
			System.out.print(val1 +"\n" + val2);
		}
		else {
			System.out.println("No path Exists");
		}
	}
}