import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int val = 2;
        for (int i = 1; i <= n; i++) {
            for ( int j = 1; j<= i; j++) {
                int res = val*((2*val)-1);
                String res_format = String.format("%05d",res);
                System.out.print(res_format+" ");
                val+=2;
            }
            System.out.println();
        }
    }
}