package morepractice;
import java.util.*;
import java.io.*;
class OperationDemo{
	public static int getTotalCount(ArrayList<Integer> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			count++;
		}
		return count;
	}
	public static int getSumOfValues(ArrayList<Integer> list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
	}
	public static ArrayList<Integer> modifyMinimumNumber(ArrayList<Integer> list){
		//int i=0,j=0;
		/*int min=Collections.min(list);
		int id=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)<list.get(j)) {
					int num=list.get(i);
					min=num;
					id=list.indexOf(min);
					
				}break;
			}
		}
		list.set(min,999);
		return list;*/
		ArrayList<Integer>sorted=new ArrayList<Integer>();
		sorted.addAll(list);
		Collections.sort(sorted);
		int num=sorted.get(0);
		int ind=list.indexOf(num);
		list.set(ind, 999);
		return list;
		
	}
	public static int getValueAt(ArrayList<Integer> list, int n) {
		int val=list.get(n);
		return val;
	}
}
public class prob9 {
public static void main(String[] argrs)throws Exception{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<4;i++) {
		al.add(sc.nextInt());
	}
	System.out.println(OperationDemo.getTotalCount(al));
	System.out.println(OperationDemo.getSumOfValues(al));
	System.out.println(OperationDemo.modifyMinimumNumber(al));
	System.out.println(OperationDemo.getValueAt(al,2));
}
}
