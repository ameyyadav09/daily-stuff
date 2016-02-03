import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int maxVal = 0;
        for ( int i = 0; i < n; i++) {
        	String str = topic[i];
        	for ( int j = i+1 ; j < n; j++) {
        		if ( str|topic[j]) {
        			maxVal = str;
        		}
        	}
        }
    }
}
