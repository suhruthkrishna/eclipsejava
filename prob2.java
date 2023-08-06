package morepractice;
import java.util.*;
import java.io.*;
public class prob2 {
public  static  ArrayList<String> createNameList(String name,int noOfTimes){
	// write the logic to create an ArrayList of Name for the specified noOfTimes
            // your logic should add given name into ArrayList repeatedly for the given noOfTimes
               // and return the ArrayList of Names.
	ArrayList<String>first=new ArrayList<>();
	for(int i=0;i<noOfTimes;i++) {
		first.add(name);
	}
	return first;
	      }

public static  ArrayList<String> modifyNameList(ArrayList<String> names, String  findMe, String replaceWithMe){
	// write the logic to find a name in the names list and replace it by another name
	// return the ArrayList of names after replacing them
	Collections.replaceAll(names, findMe, replaceWithMe);
	return names;
	}
public static void main(String[] argrs)throws IOException{
	ArrayList<String>al=new ArrayList<>(createNameList("hello",2));
	al.addAll(createNameList("here",3));
	System.out.println(modifyNameList(al,"here","world"));	

}
}
