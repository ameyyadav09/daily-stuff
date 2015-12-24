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
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            int val = 0;
            if (list.size() > 1) {
                if (list.get(0) > list.get(list.size()-1)) {
                    val = list.get(0);
                    list.remove(0);
                }
                else {
                    val = list.get(list.size()-1);
                    list.remove(list.size()-1);
                }
            }
            else {
                val = list.get(0);
            }
            // System.out.println(val);
            sum = sum + (val*i);
        }
        System.out.println(sum);
    }
}