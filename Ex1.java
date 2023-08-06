package capgemini;
import java.util.*;
import java.io.*;
public class Ex1{
public static void main(String[] args) {
                
        for(int n=1;n<=5;n++)
        {
            System.out.print(n + "\t");
        }
        System.out.println();
        int k=1;
        for(;k<=5;k++)
        {
            System.out.print(k + "\t");
        }
        
        System.out.println();
        k=1;
        for(;k<=5;)
        {
            System.out.print(k + "\t");
            k++;
        System.out.println();
        k=1;
        for(;;)
        {
            System.out.print(k + "\t");
            k++;
            if(k==6)
                break;
        }
        
        System.out.println();
        
        for(int x=1;x<=5;)
        {
            System.out.print(x + "\t");
            x++;
        }
        
        System.out.println();
        
        for(int x=1;;)
        {
            System.out.print(x + "\t");
            x++;
            if(x==6)
                break;
        }
    }
}
}
