package collectionspract;

import java.util.*;
class ArrayListOps {
	int n;
	ArrayList<Integer>a1=new ArrayList<Integer>();
	ArrayList<Integer>list=new ArrayList<Integer>();
	
	public ArrayList<Integer> makeArrayListInt(int n){
		for(int i=0;i<n;i++)
		a1.add(0);
		return a1;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer>list){
		//Collections.reverse(list);
		ArrayList<Integer> list1=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			list1.add(list.get(i));
		}
		return list1;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list,int m, int n){
		Collections.replaceAll(list,m,n);
		return list;
	}
}
public class Source{
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
		int n=4;
		ArrayListOps al=new ArrayListOps();

		System.out.println(al.makeArrayListInt(n));
		System.out.println(al.reverseList(list));
		System.out.println(al.changeList(list,28,20));
	}
}