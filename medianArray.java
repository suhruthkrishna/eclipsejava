
  //package practice;
import java.util.*;
import java.io.*;
public class targetsum {
    public static int computeMedian(ArrayList<Integer> al){
        int l=al.size();
        //System.out.println(l);
        int median=0;
        if((l&1)==0){
            int num=l/2;
            //System.out.println(num);
            int x=al.get(num);
            int y=al.get(num-1);
            //System.out.println(x+" "+y);
            median=(x+y)/2;

        }
        else{
            int z=Math.round(l/2);
            //System.out.println(z);
            median=al.get(z);
        }
        return median;
    }
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[m];
		ArrayList<Integer>al=new ArrayList<>(n+m);
		ArrayList<Integer>al1=new ArrayList<>();
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    al.add(arr[i]);
		}
		//System.out.println(al);
		for(int i=0;i<m;i++){
		    arr1[i]=sc.nextInt();
		    al1.add(arr1[i]);
		}
		//System.out.println(al1);
		al.addAll(al1);
		//System.out.println(al);
		Collections.sort(al);
		//System.out.println(al);
		System.out.println(computeMedian(al));
	}
}
