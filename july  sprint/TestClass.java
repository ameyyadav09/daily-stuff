/* IMPORTANT: Multiple classes and nested static classes are supported */

 //uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TestClass {
    public static long [] players_matches;
    
    public static void matcher(long [] strengths, int low, int high) {
        if (low < high) {
            int mid = (low + high)/2;
            matcher(strengths,low,mid);
            matcher(strengths,mid+1,high);
            counter(strengths,low,high);
        }
    }

    public static void counter(long [] strengths, int low, int high) {
        for(int i = low; i < high-1; i++) {
            if (strengths[i] != Integer.MIN_VALUE) {
                for ( int j = i+1; j < high; j++) {
                    if (strengths[j] != Integer.MIN_VALUE) {
                        System.out.println(strengths[i]+" "+strengths[j]);
                        players_matches[i]++;
                        players_matches[j]++;
                        if(strengths[i] > strengths[j])
                            strengths[j] = Integer.MIN_VALUE;
                        else
                            strengths[i] = Integer.MIN_VALUE;
                        break;
                    }
                }
            }
        }
    }
    
    public static void main(String args[] ) throws Exception {
        System.out.println(Integer.MIN_VALUE);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //parsing n,q values
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine()," ");
        long [] strengths = new long[n]; int i = 0;
        //parsing strengths into array
        while (st.hasMoreTokens()) {
            strengths[i++] = Long.parseLong(st.nextToken());
        }
        
        players_matches = new long[n];
        TestClass.matcher(strengths,0,n);
        
        for (i = 0; i < q; i++) {
            int val = Integer.parseInt(br.readLine());
            System.out.println(players_matches[val-1]);
        }
    }
}
