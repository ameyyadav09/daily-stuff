import java.util.*;
import java.io.*;
public class Solution1 {

	private static int gcd(int a, int b) {
		if (b == 0) return a;
			return gcd(b, a%b);
	}

	private static int lcm(ArrayList<Integer> a, int n) {
		int res = 1, i;
		for (i = 0; i < n; i++) {
			res = res*(a.get(i))/gcd(res, (a.get(i)));
		}
	  	return res;
	}


	public static void main(String...args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ip = Integer.parseInt(br.readLine());
		StringTokenizer  st;
		String name = "", first_init = "";
		String questioner = "", answerer = "";
		ArrayList<Integer> array = new ArrayList<Integer>();
		int darrell = 0, sally = 0, init = ip, check = 0;
		try {
			if (ip < 2 || ip > 10)
				throw new Exception();
			while(ip>0) {
				st = new StringTokenizer(br.readLine(), " ,");
				name = st.nextToken();
				if (name.equals("A")) {
					name = st.nextToken();
					if(name.equals(questioner)) {
						throw new Exception();
					}
					if(check%2 == 0)
						throw new Exception();
					String temp = st.nextToken();
					if(temp.equals("PASS")) {
						System.out.println("Question is PASSed");
						int res = lcm(array, array.size());
						System.out.println("Answer is: "+(res));
						System.out.println(name+": 0points");
					}
					else {
						int ans = Integer.parseInt(temp);
						Boolean flag = false;
						for(int i = 0; i < array.size(); i++) {
							if(ans%array.get(i) != 0) {
								flag = true;
								break;
							}
						}
						if(flag) {
							System.out.println("Wrong Answer");
							System.out.println(name+": 0points");
						}
						else{
							System.out.println("Correct Answer");
							if(name.equals("Darrell")) {
								darrell+=10;
								System.out.println(name+": 10points");
							}
							else {
								sally+=10;
								System.out.println(name+": 10points");
							}
						}
					}
					array.clear();
					answerer = name;
					questioner = "";
				}
				else if(name.equals("Darrell") || name.equals("Sally")){
					if(check > 0 && !name.equals(answerer))
						throw new Exception();
					if(check%2 == 1)
						throw new Exception();
					array.clear();
					while(st.hasMoreTokens()) {
						int t = Integer.parseInt(st.nextToken());
						if (t < 0 || t > 100)
							throw new Exception();
						array.add(t);
					}
					if(array.size() < 2 || array.size() > 7)
						throw new Exception();
					System.out.print(name+"'s question is: ");
					String array_str = "";
					for(int each: array) {
						array_str = array_str+(each)+",";
					}
					System.out.println(array_str.substring(0,array_str.length()-1));
					questioner = name;answerer = "";
				}
				else {
					throw new Exception();
				}
				if(ip == init)
					first_init = name;
				ip--;check++;
			}
			System.out.println("Total Points:");
			if(first_init.equals("Sally")) {
				System.out.println("Sally: "+(sally)+"points");
				System.out.println("Darrell: "+(darrell)+"points");
			}
			else {
				System.out.println("Darrell: "+(darrell)+"points");	
				System.out.println("Sally: "+(sally)+"points");
			}
			System.out.print("Game Result: ");
			if(sally == darrell)
				System.out.println("Draw");
			else if(sally > darrell)
				System.out.println("Sally is winner");
			else
				System.out.println("Darrell is winner");
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}
	}
}