package morepractice;
import java.util.*;
import java.io.*;
class Activity{
    String string1;
    String string2;
    String operator;
    public Activity() {
    	string1="";
    	string2="";
    	operator="";
    }
    public Activity(String string1,String string2,String operator) {
    	this.string1=string1;
    	this.string2=string2;
    	this.operator=operator;
    }
}
public class prob5 {
	public static String handleException(Activity a)throws Exception{
		String str="";
		try{
			if(a.string1.isEmpty()||a.string2.isEmpty()) {
				throw new NullPointerException("Null values found");
			}
			if(!a.operator.equals("+")&&!a.operator.equals("-")) {
				throw new Exception("Not a proper operator");
			}
			else 
				str="No exceptions found";
		}
		catch (NullPointerException e) {
			return e.getMessage();
		}
		catch(Exception ex) {
			return ex.getMessage();
		}
		System.out.println(str);
		String res=doOperation(a);
		return res;
	}
	public static String doOperation(Activity a)throws Exception{
		String sol="";
		String s=a.operator;
		switch(s) {
		case "+":
			sol=a.string1.concat(a.string2);
			break;
		case "-":
			sol=a.string1.replaceAll(a.string2,"");
			break;
		default:
			sol="Enter a valid operator";
		}
		
		return sol;
		
	}
public static void main(String[] argrs)throws Exception{
	Scanner sc=new Scanner(System.in);
	Activity a=new Activity("helloworld","hel","-");
	System.out.println(handleException(a));
}
}
