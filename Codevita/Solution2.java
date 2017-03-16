Problem : Minimum Distance

Two riders A and B are travelling on a highway towards each other on two roads that intersect at right angle at speeds VA meters/second and VB meters/second. A is at a distance of 'x' meters and B is at a distance of 'y' meters from the intersection. Calculate the minimum distance between these two riders that is possible. 

 
                                                             Fig:Approaching Intersection 

Input Format: 

First line contains the distance of Rider A from intersection denoted by x 
Second line contains the distance of Rider B from intersection denoted by y 
Third line contains the Velocity of Rider A denoted by VA 
Fourth line contains the Velocity of Rider B denoted by VB 

Output Format: 

Print the minimum distance between these two riders, if minimum distance is non-zero. If minimum distance is zero, print it as 0.0 

Constraints:
x > 0
y > 0
VA > 0 
VB > 0 
Calculation and printing of output should be done upto 11-precision

Sample Input and Output

SNo.	Input	Output
1	
100
100
10
10

0.0
2	
500
300
20
14

41.18252056395
3	
100
100
30
40

22.36067977500
5	
0
50
-20
30

Invalid Input  
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
	public static void main(String [] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double distance_A = Integer.parseInt(br.readLine());
		double distance_B = Integer.parseInt(br.readLine());
		double speed_A = Integer.parseInt(br.readLine());
		double speed_B = Integer.parseInt(br.readLine());

		while (distance_A > 0 && distance_B > 0) {
			
		}
	}
}
