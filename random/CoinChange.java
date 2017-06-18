import java.util.*;
import java.io.*;
public class CoinChange {
	public static void coiner(int [] arr, int val) {
		int n = arr.length;
		int [] mem = new int[val+1];
		for (int i = 0; i <= val; i++) {
			mem[i] = Integer.MAX_VALUE;
		}
		mem[0] = 0;
		for(int i = 0; i <= val; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j] <= i && mem[i - arr[j]]+1 < mem[i]) {
					mem[i] = mem[i-arr[j]]+1;
				}
			}
		}
		System.out.println(mem[val]);
	}

	public static void inputter() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		int [] arr = new int[n];
		while(i < n) {
			arr[i++] = Integer.parseInt(br.readLine());
		}
		int ele = Integer.parseInt(br.readLine());
		coiner(arr, ele);
	}
	public static void main(String[] args) throws IOException {
		inputter();
	}
}