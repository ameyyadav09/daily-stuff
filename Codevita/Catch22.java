/*
3
9 4 3 13 10
9 7 1 11 13
4 4 3 8 12

63 F
25 F
No Ditch

5
8 4 7 11 22
4 5 4 25 6
4 9 3 6 29
7 10 6 24 12
10 10 1 9 7

133 F
216 B
231 B
408 B
9 F
**/
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	public static void main(String...args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for ( int i = 0; i < n; i++) {
			//declare variables
			int forward = 0, backward = 0, time = 0, forward_ditch = 0, backward_ditch = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			//parse the inputs
			while (st.hasMoreTokens()) {
				forward = Integer.parseInt(st.nextToken());
				backward = Integer.parseInt(st.nextToken());
				time = Integer.parseInt(st.nextToken());
				forward_ditch = Integer.parseInt(st.nextToken());
				backward_ditch = Integer.parseInt(st.nextToken());
			}
			//check for No ditch case
			if (forward == backward && forward<forward_ditch && backward > -backward_ditch) {
				System.out.println("No Ditch");
				System.exit(0);
			}
			else {
				int position = 0;
				int time_taken = 0;
				int index = 1;
				//moving robot to and fro
				do {
					if (index%2 != 0) {
						position += forward;
						time_taken = time_taken+(forward*time);
					}
					else {
						position -= backward;
						time_taken += (backward*time);
					}
					index++;
				}while(position < forward_ditch && position > -backward_ditch);

				//robot fell into dictch

				if(position >= forward_ditch) {
					position -= forward_ditch;
					time_taken -= (position*time);
					System.out.println(time_taken+" F");
				}
				else if(position <= backward_ditch) {
					position += backward_ditch;
					time_taken += (position*time);
					System.out.println(time_taken+" B");
				}
			}
		}
	}
}