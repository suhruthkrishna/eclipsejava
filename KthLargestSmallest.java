package practice;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class KthLargestSmallest {
	/**
	 * @param argrs
	 * @throws IOException
	 */
	/**
	 * @param argrs
	 * @throws IOException
	 */
	public static void main(String[] argrs) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int res=Klargest(ar,k);
		int sol=Ksmallest(ar,k);
		Arrays.sort(ar);
		for(int i=0;i<n;i++) {
		System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("smallest: "+sol);
		ArrayList<Integer> al =new ArrayList<Integer>(n);
		//Collections.addAll(al,ar);
		
		for(int i=0;i<n;i++) {
			//System.out.print(al.get(i)+" ");
			al.add(ar[i]);
			}
		Collections.sort(al,Collections.reverseOrder());
			System.out.println(al);
		System.out.println("largest: "+res);
		sc.close();
	}

	private static int Ksmallest(int[] ar, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i : ar) {
			maxHeap.add(i);
			if(maxHeap.size()>k) {
				maxHeap.remove();
			}
		}
		return maxHeap.remove();
		
	}

	private static int Klargest(int[] ar, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>minHeap=new PriorityQueue<Integer>();
		for(int i : ar) {
			minHeap.add(i);
			if(minHeap.size()>k) {
				minHeap.remove();
			}
		}
		return minHeap.remove();
	}
}
