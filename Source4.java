package collectionspract;
import java.util.*;
import java.io.*;

public class Source4 {
	public  static  ArrayList<String>    createNameList(String name,int noOfTimes){
		ArrayList<String> n=new ArrayList<String>();
		for(int i=0;i<noOfTimes;i++) {
			n.add(name);
		}
		return n;
		      }
	public static  ArrayList<String>   modifyNameList(ArrayList<String> names, String  findMe, String replaceWithMe){
		// write the logic to find a name in the names list and replace it by another name
		// return the ArrayList of names after replacing them
		Collections.replaceAll(names, findMe, replaceWithMe);
		return names;
		}
public static void main(String[] argrs)throws IOException{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();
	ArrayList<String>ne1=new ArrayList<String>(createNameList(s,n));
	//System.out.println(ne1);
	ne1.addAll(createNameList("hi",2));
	System.out.println(ne1);
	System.out.println(modifyNameList(ne1,"hello","whatsup"));
}
}
