
package practice;
import java.util.*;
import java.io.*;
public class targetsSum {
	static boolean target(ArrayList<Integer>arr,int key) {
	    boolean flag=false;
		//ArrayList<Integer>arr1=new ArrayList<Integer>();
		for(int i=0;i<arr.size();i++) {
			int num=arr.get(i);
			int n=key-num;
			if(n==0) {
				flag= true;
			}
			else if(arr.contains(n)) {
				flag=true;
			}
			else{
			    flag=false;
			}
		}
		return flag;
	}
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=sc.nextInt();
		ArrayList<Integer>arr=new ArrayList<>();
		int[] ar=new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
			arr.add(ar[i]);
			}
		
		if(target(arr,n)){
		    System.out.println("True");
		}
		else{
		    System.out.println("False");
		}
	}
}

