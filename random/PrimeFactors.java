import java.util.*;
import java.io.*;

public class PrimeFactors {
	public static void main(String [] args) throws Exception{
		int ip = 0;
		BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
		ip = Integer.parseInt(be.readLine());
		while(ip > 0) {
			int n = 0;
			n = Integer.parseInt(be.readLine());
			Set<Integer> hash = new HashSet<Integer>();
			if(n%2 == 0)
				hash.add(2);
			while(n%2 == 0) {
				n = n/2;
			}
			for(int i = 3; i <= Math.sqrt(n); i = i+2) {
				while(n%i == 0) {
					hash.add(i);
					n = n/i;
				}
			}

			if(n > 2) {
				System.out.println(n);
			}
			else {
				Iterator<Integer> it = hash.iterator();
				while(it.hasNext()) {
					System.out.print(it.next()+" ");
				}
				System.out.println();
			}
			ip--;
		}
	}
}