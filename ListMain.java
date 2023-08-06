package collectionspract;
import java.util.*;
import java.io.*;

public class ListMain {
public static void main(String[] argrs)throws IOException{
	//String cities[]= {"Hyderabad","Chennai","Banglore"};
	ArrayList<String> cities=new ArrayList<>();
	cities.add("Hyderabad");
	cities.add("Chennai");
	cities.add("Bangalore");
	cities.add("Pune");
	System.out.println(cities.size());
	cities.add("Kolkata");
	System.out.println(cities);
	for (String s:cities) {
		System.out.println(s);
	}
	
}
}
