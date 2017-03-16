import java.util.*;
public class DigitPermutations {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().replace(" ","");
		Method mt = new Method(str.length());
		mt.permutation(str);
		mt.getArray();
	}
}
class Method {
	ArrayList<String> list;
	int n;
	Method(int n) {
		this.n = n;
		list = new ArrayList<String>();
	}
	Method() {
		list = new ArrayList<String>();
	}
	public void permutation(String str) { 
	    permutation("", str); 
	}

	public boolean check(String str) {
		for( int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}
	private void permutation(String prefix, String str) {
		if(prefix.length()==n) {
			if(check(prefix))
				list.add(prefix); return;
		}
	   for(int i=0; i<str.length(); i++) permutation(prefix+str.charAt(i),str);
	}

	public void getArray() {
		String temp = "";
		for(int i = 0; i < list.size(); i++) {
			temp += list.get(i)+",";
		}
		System.out.println(temp.substring(0, temp.length()-1));
	}
}