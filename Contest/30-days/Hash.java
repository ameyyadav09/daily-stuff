//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Hash{
   public static void main(String []argh)
   {
       Hashtable<String,Integer> list = new Hashtable<String,Integer>();
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=Integer.parseInt(in.nextLine());
         // in.nextLine();
          list.put(name,phone);
      }
      while(in.hasNext())
      {
         try {
          String s=in.nextLine();
          int num = list.get(s);
          System.out.println(s +"="+num);
        }
        catch(Exception e) {
          System.out.println("Not found");
        }
      }
   }
}
