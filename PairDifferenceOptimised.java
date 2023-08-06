package practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class PairDifferenceOptimised {
	public static void pairDiffer(int n,int k, int[] ar) {
		int count=0;
		Arrays.sort(ar);
		int l=0;int r=0;
		while(r<n) {
			if(ar[l]-ar[r]==k) {
				count++;
				l++;
				r++;
			}
			else if(ar[l]-ar[k]<k) {
				r++;
			}
			else {
				l++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] argrs) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		pairDiffer(n,k,ar);
	}
}
