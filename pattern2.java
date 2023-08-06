package capgemini;
import java.util.*;
import java.io.*;
public class pattern2 {
public static void main(String[] argrs)throws IOException{
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the value n which will represent the rows");
    int n = sc.nextInt();   
    for (int i = 1; i <= n; i++) 
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(j+" ");
        }
         
        System.out.println();
    }
}
}
