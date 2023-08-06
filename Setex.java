package capgemini;
import java.util.*;
import java.io.*;
public class Setex {
public static void main(String[] argrs)throws IOException{
	Set<String>myfam=new LinkedHashSet<String>();
	myfam.add("Dad");
	myfam.add("Mom");
	myfam.add("Me");
	for(String s:myfam) {
		System.out.println(s+" ");
	}
	//System.out.println(myfam);
}
}
