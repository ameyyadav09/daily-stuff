import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
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
        long sum = 2, count = 0;
        for(int i = 3;i < n; i+=2) {
            if (isPrime(i)) {
                sum += i;
                if(sum == i) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}