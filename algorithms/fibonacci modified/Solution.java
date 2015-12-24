import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String [] array = sc.nextLine().split(" ");
        BigInteger first = new BigInteger(array[0]);
        BigInteger sec = new BigInteger(array[1]);
        int n = Integer.parseInt(array[2]);
        BigInteger val = BigInteger.ONE;
        for ( int i = 0; i < n -2; i++ ) {
            val = first.add(sec.multiply(sec));
            first = sec;
            sec = val;
        }
        System.out.println(val);
    }
}