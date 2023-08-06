package practice;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class nextPalindrome {
	public static int reverse(int n) {
		StringBuffer str=new StringBuffer(String.valueOf(n));
		str.reverse();
		int num=Integer.parseInt(str.toString());
		return num;
	}
	
	public static void main(String args[])throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(true) {
			n=n+reverse(n);
			if(isPalindrome(n)) {
				System.out.println(n);
				break;
			}
		}
	}

	private static boolean isPalindrome(int n) {
		// TODO Auto-generated method stub
		return n==reverse(n);
	}
}
