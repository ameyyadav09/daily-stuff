import java.io.*;
import java.util.*;

public class NumberSequence {
    private static long array [] = new long[10000];
    static long den = (long)Math.pow(10,9)+7;
    static int i = 2;
    
    private static long fact(int val) {
        if (array[val] != 0) {
            return array[val];
        }
        for(; i <= val; i++) {
            array[i] = (array[i-1]*i)%den;
        }
        return array[val];
    }
    
    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        array [0] = 1;
        array [1] = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        n = Integer.parseInt(br.readLine());
        int val = 0, count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            val = Integer.parseInt(st.nextToken());
            if(val < 0) {
                count++;
            }
        }
        System.out.println(fact(n)/fact(n-count));
    }
}