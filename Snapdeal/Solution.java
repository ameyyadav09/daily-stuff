import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       	double N = Double.parseDouble(sc.next());
        double Q = Double.parseDouble(sc.next());
       	ArrayList<Double> array = new ArrayList<Double>();
        for( int i = 0; i < N; i++) {
        	array.add(i,Double.parseDouble(sc.next()));
        }
        ArrayList<ArrayList<Integer>> query = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < Q; i++) {
        	query.add(new ArrayList<Integer>());
        	for(int j = 0; j < 3; j++) {
        		query.get(i).add(Integer.parseInt(sc.next()));
        	}
        }
        for(int i = 0; i < query.size(); i++) {
        	double X = query.get(i).get(0);
        	int index = array.indexOf(X);
        	if(index != -1) {
	        	if(query.get(i).get(2) == 0) {
	        		index = index + query.get(i).get(1);
	        		if(index < array.size()) {
	        			System.out.println(Math.round(array.get(index)));
	        		}
	        		else{
	        			System.out.println("-1");
	        		}
	        	}
	        	else if(query.get(i).get(2) == 1) {
	        		index = index - query.get(i).get(1);
	        		if(index >= 0) {
	        			System.out.println(Math.round(array.get(index)));
	        		}
	        		else{
	        			System.out.println("-1");
	        		}
	        	}
			}
			else
				System.out.println("-1");
        }
    }
}