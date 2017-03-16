import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Prime {
    public static void main(String...args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long [] array = new long[(int)n+1];
        for (int i = 0; i <=n ; i++) {
            array[i] = i;
        }
        int p = 2;
        for (;p*p <= n; p++) {
            for(int j = 2*p; j <= n; j+=p) {
                array[j] = 0;
            }
        }
        Hashtable<Long, Boolean> hash = new Hashtable<Long, Boolean>();
        long sum = 2;int count = 0;
        for ( int i = 3; i <= n; i++) {
            if (hash.containsKey(array[i])) {
                count++;
            }
            if (array[i] != 0) {
                sum += array[i];
                hash.put(sum, true);
            }
        }
        System.out.println(count);
        // System.out.println(12000000000 > Integer.MAX_INT);
    }
}