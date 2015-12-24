import java.io.*;
import java.util.*;

public class numberRep {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = 0;
        String str = "";
        try {
            n = Integer.parseInt(in.readLine().trim());
            str = in.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        StringTokenizer st = new StringTokenizer(str," ");
        int [] array = new int[st.countTokens()];
        int i = 0, count = 0;
        while(st.hasMoreTokens()) {
            array[i] = Integer.parseInt(st.nextToken().trim());
            if(i > 0) {
                if (array[i] <= array[i - 1]) {
                    array[i] = array[i-1] + 1;
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);        
    }
}