import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for ( int i = 0; i < n; i++) {
            long val = Long.parseLong(sc.nextLine());
            if (val == 2)System.out.println("Prime");
            else if ( val %2 == 0 || val == 1) {
                System.out.println("Not prime");
            }
            else {
                long temp = 1 , sqr = 2;
                while (sqr <= val) {
                    temp++;
                    sqr = temp*temp;
                }
                boolean flag = true;
                for ( int j = 3; j<temp && flag;j++) {
                    if (val % j == 0) {
                        System.out.println("Not prime");
                        flag = false;
                    }
                }
                if (flag)System.out.println("Prime");
            }            
        }
    }
}
