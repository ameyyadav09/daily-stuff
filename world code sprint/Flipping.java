import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
@SuppressWarnings("unchecked")
class MaxMethods {
	private int [] array;
	private int count;
	private int size;
	MaxMethods(int n) {
		array =  new int[2*n+1];
		this.size = n;
		count = 1;
	}
	public void insert(int value) {
		if(count == 1) {
			array[count] = value;
			count++;
		}
		else if(count != 1 && count < size){
			array[count] = value;
			bubbleUp(count);
			count++;
		}
		else {
			int temp = array[1];
			if(temp < (value)) {
				array[1] = value;
				bubbleDown();
			}
		}
	}
	public int extractmin() {
			int temp = array[1];
			array[1] = array[count - 1];
			bubbleDown();
			count--;
			return temp;
	}
	public void bubbleUp(int index) {
		int temp = index/2;
			while(index > 1 && temp > 0) {
				if(array[index] > (array[temp])) {
					swap(index,temp);
					index = temp;temp = temp/2;
				}
				else {
					break;
				}
			}
	}
	public void bubbleDown()
	{
		int parent = 1;
		int left = 2 * parent ;
		int right = (2 * parent) + 1;
		while(left < count) {
			int index = left;
			if(right < count) {
				if(array[left] < (array[right])) {
					index = right;
				}
			}
			if(array[index] > (array[parent])) {
				swap(index , parent);
				parent = index;
				left = parent*2;
				right = left+1;
			}
			else
				break;
		}
	}
	public void swap( int i , int j) {
		int hold = array[i];
				array[i] = array[j];
				array[j] = hold;
	}
	public void modifyIndex(int index, int value)
	{		
		if(value < (array[index])) {
			array[index] = value;
			bubbleDown();
		}
		else {
			array[index] = value;
			bubbleUp(index);
		}
	}

	public void print() {
		int sum = 0;
		for (int i = 1; i < count ; i++) {
			System.out.println(array[i]);
			sum = sum + array[i];
		}
		System.out.println(sum);
	}
}
@SuppressWarnings("unchecked")
public class Flipping {
	public static void main ( String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ip = Integer.parseInt(br.readLine());
		while(ip > 0) {
			int n = Integer.parseInt(br.readLine());
			MaxMethods obj = new MaxMethods(n);
			for( int i = 0; i < 2*n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					int temp = Integer.parseInt(st.nextToken());
					obj.insert(temp);
				}
			}
			ip--;
			obj.print();
		}
	}
}