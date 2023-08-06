package morepractice;
import java.util.*;
import java.io.*;
class ArrayListOps{
	//makeArrayListInt where all the elements are 0
	// reverseList reverse the arraylist
	//changeList replace all the elements of the arraylist
	int n;
	ArrayList<Integer>al=new ArrayList<>();
	public static ArrayList<Integer> makeArrayList(int n){
		ArrayList<Integer>num=new ArrayList<>();
		for(int i=0;i<n;i++) {
			num.add(0);
		}
		return num;
	}
	public static ArrayList<Integer> reverseList(ArrayList<Integer>list){
		//Collections.reverse(list);
		ArrayList<Integer>rev=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			rev.add(list.get(i));
		}
		return rev;
	}
	public static ArrayList<Integer> changeList(ArrayList<Integer>list,int m,int n){
		int size=list.size();
		for(int i=0;i<size;i++) {
			if(list.get(i)==m) {
				int index=list.indexOf(m);
				list.set(index, n);
			}
		}
		return list;
	}
	
}
public class prob7 {

public static void main(String[] argrs)throws IOException{
	ArrayList<Integer> alr=new ArrayList(Arrays.asList(10,25,33,28,10,12));
	ArrayList<Integer>list=new ArrayList<Integer>(ArrayListOps.makeArrayList(4));
	System.out.println(list);
	ArrayListOps alo=new ArrayListOps();
	System.out.println(alo.reverseList(alr));
	System.out.println(alo.changeList(alr, 10, 20));
	//10,25,33,28,10,12
}
}
