package collectionspract;
import java.util.*;
public class StudentService {
	public static void main(String args[]) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Hello");
		hm.put(2, "WOrld");
		hm.put(3,"This ");
		hm.remove(2);
		//System.out.println(hm);
		 for (Map.Entry<Integer,String> e : hm.entrySet())
	            System.out.println( e.getKey()+" "+ e.getValue());
			
	}
}
