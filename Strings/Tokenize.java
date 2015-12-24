    import java.io.*;
    import java.util.*;



    public class Tokenize {

      
        public static void main(String[] args) 
        {
          ArrayList<String> list = new ArrayList<String>();
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
          s = s+" ";
          String str ="";
          for ( int i = 0; i < s.length(); i++) {
              int c = (int)s.charAt(i);
              // System.out.println(c);
              if ((c >= 65 && c <= 90)||(c >= 97 && c <= 122)) {
                  char ch = (char)c;
                  str = str + "" + ch;
              }
              else {
                  if (str != "" ) {
                    list.add(str);
                    str = "";
                  }
              }
          }
          System.out.println(list.size());
          Iterator it = list.iterator();
          while(it.hasNext()) {
            System.out.println(it.next());
          }
        }
    }
