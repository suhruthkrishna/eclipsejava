package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PairDifferece {
	public static void main(String[] argrs) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		ArrayList<Integer> al=new ArrayList<>();
		int count=0;
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			if(!al.contains(ar[i])) {
				al.add(ar[i]);
			}
		}
		for(int i=0;i<al.size();i++) {
			int num=al.get(i)-k;
			if(al.contains(num)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
