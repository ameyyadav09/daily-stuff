import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int finalsum = Integer.MIN_VALUE;
        for ( int i = 0; i < n; i++) {
            int val = Integer.parseInt(sc.next());
            if ( sum > finalsum) {
                    finalsum = sum;
                    // System.out.println(finalsum);
                }
            if(val != 0) {
                System.out.println(sum);
                sum = sum + val;
            }
            else {
                sum = 0;
            }
        }
        if ( sum > finalsum) {
            finalsum = sum;
        }
        System.out.println(finalsum);
    }
}