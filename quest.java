package practice;
import java.util.*;
import java.io.*;
public class quest {
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int count=0;
		int p[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int index=0;
		for(int i=0;i<n;i++) {
			//p[i]=sc.nextInt();
			if(e>=p[i]) {
				index=i;
				e+=b[index];
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
