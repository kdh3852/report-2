package hello;
import java.io.*;



public class test2 {

	  public static void main(String[] ar)throws IOException{
		  
          BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

          System.out.print("¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
          int year=0;
 
          year=Integer.parseInt(in.readLine());
 
          if(year%100==0&&year%400==0){
                System.out.println(year+"´Â À±³â");
          }
 
          else if(year%4==0&&year%100!=0){
                System.out.println(year+"´Â À±³â");
          }
 
          else
                System.out.println(year+"´Â À±³â¾Æ´Ô");
    }
}
