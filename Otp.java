package practice;
import java.io.*;
import java.util.*;
import java.io.IOException;
public class Otp {
	public static void main(String[] argrs) throws IOException {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i%2==1) {
				int num=Integer.parseInt(""+s.charAt(i));
				s1+=Math.round(Math.pow(num,2));
			}
		}
		System.out.println(s1.substring(0,4));
	}
}
