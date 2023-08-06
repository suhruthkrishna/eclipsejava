package basics;
import java.util.*;
import java.io.*;

public class basics3 {
public static void main(String[] argrs)throws IOException{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	//int b=sc.nextInt();
	//System.out.println(a+" "+b);
	/*
	+
	-
	*
	/
	%
	*/
	if(a%3==0) {
		System.out.println("Is divisible by 3");
	}
	else {
		System.out.println("Not divisible by 3");
	}
}
}
