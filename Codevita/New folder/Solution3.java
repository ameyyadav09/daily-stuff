import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Solution3 {
    static long sum = 2;
    static Hashtable<Long, Boolean> hash = new Hashtable<Long, Boolean>();
    public static boolean isPrime(long val) {
        long sqrt = (long)Math.sqrt(val);
        for(int i = 3; i <= sqrt; i+=2) {
            if (val%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String...args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long count = 0;long sum = 2;
        for(long i = 3;i <= n; i+=2) {
            if (isPrime(i)) {
                if(hash.containsKey(i)) {
                    count++;
                }
                sum += i;
                hash.put(sum,true);
            }
        }
        System.out.println(count);
    }
}