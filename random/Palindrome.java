import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l = A.length()/2;
        boolean flag = true;
        if(l%2 != 0) {
            l++;
        }
        
        for(int i = 0, j = A.length()-1; i < l;i++,j-- ) {
            if(A.charAt(i) != A.charAt(j)) {
                flag = false;
                break;
            }            
        }
        if(flag == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");   
        }
        /* Enter your code here. Print output to STDOUT. */        
    }
}
