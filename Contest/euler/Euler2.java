import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for ( int i = 0; i < tests; i++) {
            int n = Integer.parseInt(sc.nextLine());
            long a = 0, b = 1, val = 0, sum = 0;
            while ( b < n) {
                val = a + b;
                a = b;
                b = val;
                if (val > n)break;
                if (val % 2 == 0) {
                    sum += val;
                }
            }
            System.out.println(sum);
        }
    }
}