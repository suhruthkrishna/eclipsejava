package practice;
import java.util.*;
import java.io.*;
public class MaxEven {
	public static void main(String[] argrs) throws IOException {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		ArrayList<Character> al=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(ch[i])) {
				//int n=ch[i];
				al.add(ch[i]);
			}
		}
		int id=-1;
		Collections.sort(al,Collections.reverseOrder());
		for(Character i: al) {
			if(i%2==0) {
				id=al.indexOf(i);
			}
		}
		if(id==-1) {
			for(Character i: al) {
				System.out.print(i+" ");
			}
		}
		else {
			Collections.swap(al, id, al.size()-1);
			for(Character i: al) {
				System.out.print(i+" ");
			}
		}

	}
}
