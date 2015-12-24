import java.io.*;
import java.util.*;
class temp{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c = 0;
		StringTokenizer st = new StringTokenizer(str," `~!@#$%^&*()_-+=}]{[|\\,.<>/?\'\";:");
		while(st.hasMoreTokens()){
			c++;
			list.add(st.nextToken());
		}
		System.out.println(c);
		for ( int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}