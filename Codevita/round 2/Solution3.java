import java.util.*;
import java.io.*;
public class Solution3 {
	private static ArrayList<Integer> array;
	private static long res;
	Solution3(int count) {
		array = new ArrayList<Integer>();
		res = Integer.MAX_VALUE;
	}
	public static void mergeSort(ArrayList<Integer> list, int low, int high) {
		if (low < high) {
			int mid = (low + high)/2;
			mergeSort(list,low,mid);
			mergeSort(list,mid+1,high);
			merge(list,low,high);
		}
	}
	public static void merge(ArrayList<Integer> list, int low, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int mid = (low + high)/2;
		int index1 = 0;
		int index2 = low;
		int index3 = mid + 1;
		while (index2 <= mid && index3 <= high) {
			if (list.get(index2) < list.get(index3) ) {
				temp.add(index1, list.get(index2));
				index1++; index2++;
			}
			else {
				temp.add(index1, list.get(index3));
				index1++; index3++;
			}
		}
		while (index2 <= mid) {
			temp.add(index1, list.get(index2));
			index1++; index2++;
		}
		
		while (index3 <= high) {
			temp.add(index1, list.get(index3));
			index1++;	index3++;
		}
		for (int i=low, j=0; i<=high; i++, j++) {
			list.set(i, temp.get(j));
		}
	}


	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		Solution3 obj = new Solution3(n);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		while(st.hasMoreTokens()) {
			array.add(Integer.parseInt(st.nextToken()));
		}
		mergeSort(array, 0, n-1);
		int res = 0;
		for (i = 0; array.size() > 2; ) {
			res = array.get(i) + array.get(i+1);
			array.remove(i);
			array.remove(i+1);
			array.add(res);
			mergeSort(array, 0, array.size()-1);
		}
		System.out.println(array.get(0));
	}
}
