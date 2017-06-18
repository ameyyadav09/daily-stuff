import java.util.*;
import java.io.*;

public class BinarySearch {

	public static int binarySearch(int [] arr, int ele, int left, int right) {
		if(left > right) {
			return -1;
		}

		int mid = (left+right)/2;

		if(arr[mid] == ele) return mid;
		else if(ele < arr[mid]) return binarySearch(arr, ele, left, mid-1);
		else return binarySearch(arr, ele, mid+1, right);

	}

	public static void inputter() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		int [] arr = new int [n];
		while(i < n) {
			arr[i++] = Integer.parseInt(br.readLine());
		}
		int ele = Integer.parseInt(br.readLine());
		System.out.println(binarySearch(arr, ele, 0, n)+1);
	}
	public static void main(String[] args) throws IOException{
		inputter();		
	}
}