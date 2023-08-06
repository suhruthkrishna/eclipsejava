
  //package practice;
import java.util.*;
import java.io.*;
public class targetsum {
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
		for(int i=0;i<size;i++) {
		    int ele=sc.nextInt();
			arr.add(ele);
		}
		System.out.println(target(arr,n));
	}
}
