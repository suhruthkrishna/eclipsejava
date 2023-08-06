package capgemini;
import java.util.*;
import java.io.*;
public class MapEx {
public static void main(String[] argrs)throws IOException{
	HashMap<Integer,String>hmaps=new HashMap<Integer,String>();
	hmaps.put(1, "sky");
	hmaps.put(2, "sta");
	hmaps.put(3, "eks");
	hmaps.put(4, "eskta");
	System.out.println(hmaps.size());
	System.out.println(hmaps);
	if(hmaps.containsKey(2)) {
		System.out.println("The variable for the key 2 is "+hmaps.get(2));
	}
}
}
