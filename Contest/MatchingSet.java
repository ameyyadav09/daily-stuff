import java.io.*;
import java.util.*;

public class MatchingSet {
    
    public static long [] sorter (long [] array) {
        for (int i = 0; i < array.length ; i++) {
            int min = i;
            for ( int j = i+1; j < array.length; j++) {
                if ( array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                long temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long x [] = new long[n];
        long y [] = new long[n];
        int i = 0;
        long sum1 = 0;
        long sum2 = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            x[i++] = Integer.parseInt(st.nextToken());
            sum1 += x[i-1];
        }
        i = 0;
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            y[i++] = Integer.parseInt(st.nextToken());
            sum2 += y[i-1];
        }
        if (sum1 == sum2) {
            long p_diff = Long.MIN_VALUE;
            long n_diff = 0;
            // x = sorter(x);
            // y = sorter(y);
            for (i = 0; i < n ; i++) {
                if (x[i] != y[i]) {
                    long temp = x[i] - y[i];
                    // if (temp > 0) {
                        if (temp > p_diff)
                            p_diff = temp;
                    // }
                    // else {
                    //     if (temp < n_diff) {
                    //         n_diff = temp;
                    //     }
                    // }
                }
            }
            // if (p_diff == Math.abs(n_diff))
                System.out.println(p_diff);
            // else
            //     System.out.println(Math.abs(n_diff) + p_diff);
        }
        else {
            System.out.println(-1);
        }
    }
}