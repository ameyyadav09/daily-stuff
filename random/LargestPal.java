import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPal {
	public static void main(String [] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long need = 0;
		for (int l = 0; l < n; l++) {
			long temp = Long.parseLong(sc.nextLine());
			for (int i = 100 ; i < 999; i++) {
				for (int j = 707; j < 999; j++) {
					long val = i * j;
					if (val > temp) break;
					else {
						long num = val, rmd = 0, rev = 0;
						while (num > 0) {
							rmd = num % 10;
							rev = rev * 10 + rmd;
							num = num / 10;
						}
						if ( rev == val) {
							if (val > need) {
								need = val;
							}
							
						}
					}
				}				
			}
		}
		System.out.println(need);
	}
}