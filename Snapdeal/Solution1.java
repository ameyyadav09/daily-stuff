import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       	int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
       	// int [] array = new int [N];
        if(N >= 1 && N <=200000) {
            if(Q >= 1 && Q <= 20) {
                ArrayList<Integer> array = new ArrayList<Integer>();
                for( int i = 0; i < N; i++) {
                    array.add(i,Integer.parseInt(sc.next()));
                }
                while(sc.hasNext()) {
                    int X = Integer.parseInt(sc.next());
                    int K = Integer.parseInt(sc.next());
                    int type = Integer.parseInt(sc.next());
                    if(X >= 1 && X <= 1000000000) {
                        if(K >= 1 && K <= N) {
                            if(type == 0) {
                                int index = -1;
                                for(int i = 0; i < array.size(); i++) {
                                    if(array.get(i) > X) {
                                        index = i-1;
                                        break;
                                    }
                                    if(array.get(i) == X) {
                                        index = i;
                                        break;
                                    }
                                }
                                if(index != -1) {
                                    index = index + K;
                                    if(index < array.size()) {
                                        System.out.println(array.get(index));
                                    }
                                    else {
                                        System.out.println("-1");
                                    }
                                }
                                else {
                                    System.out.println("-1");
                                }
                            }
                            else if(type == 1) {
                                int index = array.get(array.size()-1);
                                for(int i = array.size()-1; i >= 0; i--) {
                                    if(array.get(i) < X) {
                                        index = i+1;
                                        break;
                                    }
                                    if(array.get(i) == X) {
                                        index = i;
                                        break;
                                    }
                                }
                                if(index != -1) {
                                    index = index - K;
                                    if(index >= 0) {
                                        System.out.println(array.get(index));
                                    }
                                    else {
                                        System.out.println("-1");
                                    }
                                }
                                else 
                                    System.out.println("-1");
                            }
                            else {
                                System.out.println("-1");
                            }
                        }
                    }
                }
            }
        }
    }
}