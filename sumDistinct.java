package practice;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class sumDistinct {
	public static void main(String[] argrs) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		HashSet<Integer> set=new HashSet<>();
		int sum=0;
		for(int i=0;i<n;i++) {
			set.add(ar[i]);
			//sum=sum+set.get(i);
		}
		List<Integer> al=new ArrayList<>(set);
		for(int i=0;i<al.size();i++) {
			sum+=al.get(i);
		}
		System.out.println(sum);
	}
}
