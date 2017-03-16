import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubmaskQueries {
    private static Hashtable<Integer,Set<Integer>> hasher = new Hashtable<Integer,Set<Integer>>();
    private static Hashtable<String,Integer> decimalhasher = new Hashtable<String,Integer>();

    private static int getDecimal(String str) {
        int sum = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                sum+=Math.pow(2,str.length()-1-i);
            }
        }
        return sum;
    }
    
    private static Set<Integer> makeSubsets(int n) {
        Set<Integer> set;
        // int n = getDecimal(str);
        if (!hasher.containsKey(n)) {
            set = new HashSet<Integer>();
            for ( int x = n; x >= 0; x = ( n & (x-1) ) ) {
                set.add(n-x);
                // hasher.put((n-x),set);
                // System.out.println(n-x+"--"+set);
                if(x==0)break;
            }
            hasher.put(n, set);
        }
        else {
            set = hasher.get(n);            
        }
        return set;
    }

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> it;
        String [] inn = br.readLine().split(" ");
        int n = Integer.parseInt(inn[0]);
        int m = Integer.parseInt(inn[1]);
        int [] set = new int[(1<<n)+1];
        // makeSubsets(n);
        // System.out.println(hasher);
        while (m > 0) {
            inn = br.readLine().split(" ");
            int case_val = Integer.parseInt(inn[0]);
            int val = 0, dec = 0;
            switch(case_val) {
                case 1:
                    val = Integer.parseInt(inn[1]);
                    if(!decimalhasher.containsKey(inn[2])) {
                        dec = getDecimal(inn[2]);
                        decimalhasher.put(inn[2], dec);
                    }
                    else
                        dec = decimalhasher.get(inn[2]);
                    if(!hasher.containsKey(dec))
                        it = makeSubsets(dec);
                    else
                        it = hasher.get(dec);
                    for(int each: it) {
                        // System.out.println(each);
                        set[each] = val;
                    }
                break;
                case 2:
                    val = Integer.parseInt(inn[1]);
                    if(!decimalhasher.containsKey(inn[2])) {
                        dec = getDecimal(inn[2]);
                        decimalhasher.put(inn[2], dec);
                    }
                    else
                        dec = decimalhasher.get(inn[2]);
                    if(!hasher.containsKey(dec))
                        it = makeSubsets(dec);
                    else
                        it = hasher.get(dec);
                    for(int each: it) {
                        set[each] ^= val;
                    }
                break;
                case 3:
                val = getDecimal(inn[1]);
                System.out.println(set[val]);
                break;
            }
            // for(int k = 0; k <(1<<n)+1; k++) {
            //     System.out.print(set[k]+",");
            // }
            // System.out.println();
            m--;
        }
    }
}