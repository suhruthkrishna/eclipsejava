package basics;
import java.util.*;
import java.io.*;

public class basics2 {
public static void main(String[] argrs)throws IOException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Addition:");
	//int c=a+b;
	int c;
	c=a+b;
	System.out.println("The answer is"+" "+c);
	System.out.println("Minus:");
	int d=a-b;
	System.out.println("The answer is "+d);	
}
}
