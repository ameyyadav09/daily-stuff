import java.util.*;
public class DigitPermutations {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine().replace(" ","");
		Method mt = new Method(n);
		mt.permutation(str);
		mt.getArray();
	}
}
class Method {
	ArrayList<String> list;
	int n;
	Method(int n) {
		this.n = n;
	}
	Method() {
		list = new ArrayList<String>();
	}
	public void permutation(String str) { 
	    permutation("", str); 
	}

	private void permutation(String prefix, String str) {
		if(prefix.length()==n) {
			list.add(prefix); return;
		}
	   for(int i=0; i<str.length(); i++) permutation(prefix+str.charAt(i),str);
	}
	public void getArray() {
		System.out.println(list);
	}
}