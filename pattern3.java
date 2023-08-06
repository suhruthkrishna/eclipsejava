package capgemini;
import java.util.*;
import java.io.*;
public class pattern3 {


public static void main(String[] argrs)throws IOException{
	 Scanner sc = new Scanner(System.in);

     System.out.println("enter number of rows ");
     int n = sc.nextInt(); 
     for (int i = 1; i <= n; i++) 
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(i+" ");
         }
          
         System.out.println();
     }
     sc.close();
}
}
