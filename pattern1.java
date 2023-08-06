package capgemini;
import java.util.*;
import java.io.*;
public class pattern1 {
public static void main(String[] argrs)throws IOException{
	 Scanner sc = new Scanner(System.in);
     System.out.println("enter number n which will represent the rows");
      
     int n = sc.nextInt();
     for (int i = n; i >= 1; i--) 
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(j+" ");
         }
          
         System.out.println();
     }
      
     for (int i = 2; i <= n; i++) 
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(j+" ");
         }
          
         System.out.println();
     }
     sc.close();
}
}
