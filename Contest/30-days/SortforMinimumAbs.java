import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int minimumDifference;
  		// Add your code here
    Difference (int [] a) {
        elements = new int[a.length];
        elements = a;
        elements = sort(elements, 0, elements.length-1);
    }
    public int[] sort(int[] array, int i, int j) {
        int low = i;
        int high = j, pivot = i;
        if (low < high) {
            while (low < high) {
                while (array[low] <= array[pivot] && low < high) {
                    low++;
                }
                while (array[high] > array[pivot]) {
                    high--;
                }
                if (low < high) {
                    swap(array, low, high);
                }
            }
            swap(array, high, pivot);
            sort(array, i, high-1);
            sort(array, high+1, j);
        }
        return array;
    }
    public void swap(int [] array, int i , int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void computeDifference() {
    	// for ( int i =0; i < elements.length; i++) {
    	// 	System.out.println(elements[i]);
    	// }
        minimumDifference = Integer.MAX_VALUE;
        for ( int i = 0; i < elements.length-1; i++) {
            if (Math.abs(elements[i] - elements[i+1]) < minimumDifference) {
                minimumDifference = Math.abs(elements[i] - elements[i+1]);
            }
        }
        for(int i = 0; i < elements.length-1;i++) {
            if (Math.abs(elements[i] - elements[i+1]) == minimumDifference) {
                System.out.print(elements[i]+" "+elements[i+1]+" ");
            }
        }
    }
} // End of Difference class


public class SortforMinimumAbs {
             /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }

                Difference D = new Difference(a);

                D.computeDifference();

            }
        }