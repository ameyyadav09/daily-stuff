import java.util.*;
import java.io.*;

public class ParenthsisBalancing {

	
	static char repo [] [] = {{'{', '}'}, {'(',')'}, {'[', ']'}};

	public static boolean isOpened(char ch) {
		int n = repo[0].length;
		for (int i = 0; i <= n; i++) {

			if (repo[i][0] == ch) {
				return true;
			}
		}
		return false;
	}

	public static boolean isMatch(char comp, char top) {
		int n = repo[0].length;
		for( int i = 0; i <= n; i++) {
			if (repo[i][0] == top) {
				if (repo[i][1] == comp) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean parenth() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stream = br.readLine();
		int n = stream.length();
		char arr [] = new char[n];
		int i = 0, index = 0;
		
		while(i < n) {
			if (isOpened( stream.charAt(i)) ) {
				arr[index++] = stream.charAt(i);
			}
			else {
				if (index > 0 && isMatch(stream.charAt(i), arr[index-1] )) {
					index--;
				}
				else {
					return false;
				}
			}
			i++;
		}
		return true;
	}
	public static void main(String [] args) throws IOException{
		System.out.println( parenth() );
	}
}