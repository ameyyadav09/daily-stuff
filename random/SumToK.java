import java.util.*;
import java.io.*;

public class SumToK {

	public static void sumtok() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [n];
		while(i < n) {
			arr[i++] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> hasher = new HashMap<Integer, Integer>();
		i = 0;
		while( i < n) {
			if (hasher.containsKey(k - arr[i])) {
				System.out.println(arr[i]+ " "+ (k - arr[i]));
			}
			else {
				hasher.put(arr[i], 1);
			}
			i++;
		}
	}
	public static void main(String[] args) throws IOException {
		sumtok();
	}
}