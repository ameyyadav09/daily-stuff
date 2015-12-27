import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int [] array = new int [26];
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int ch = (int)str.charAt(i);
            if (ch != 127) {
                if (ch >= 65 && ch <= 90) {
                    array[ch - 65] = 1;
                }
                else if (ch >= 97 && ch <= 122) {
                    array[ch - 97] = 1;
                }
            }
        }
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (array[i] == 0) {
                flag = false;break;
            }
        }
        if(flag == true) {
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }
}