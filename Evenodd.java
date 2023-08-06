package practice;
import java.util.*;
import java.io.*;
public class Evenodd {
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		StringBuffer even=new StringBuffer();
		StringBuffer odd=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(ch[i])) {
				if(ch[i]%2==0) {
					even.append(ch[i]);
				}
				else {
					odd.append(ch[i]);
				}
			}
		}
		System.out.println(even);
		System.out.println(odd);
		}
}
