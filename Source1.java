package collectionspract;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity {
  //Implement Activity class here..
  String string1;
  String string2;
  String operator;
  public Activity(String string1,String string2,String operator){
    super();
    this.string1=string1;
    this.string2=string2;
    this.operator=operator;
  }
  public String getString1(){
    return string1;
  }
  public void setString1(String string1){
    this.string1=string1;
  }
  public String getString2(){
    return string2;
  }
  
  public void setString2(String string2){
    this.string2=string2;
  }
  public String getOperator(){
    return operator;
  }
  
  public void setOperator(String operator){
    this.operator=operator;
  }
}




public class Source1 {
  //Implement the two function given in description in here...
  public static String handleException(Activity a){
	 int n=a.string1.length();
	 int n1=a.string2.length();
	 String str1="";
	 try {
	 if(n1==0||n==0) {
		 throw new NullPointerException("Null Values Found");
	 }
	 else {
		 str1=doOperation(a);
	 }
	 if(a.operator.equals("+")||a.operator.equals("-")) {
		str1=doOperation(a); 
	 }
	 else {
		 throw new ArithmeticException("No proper operator provided");
	 }
	 }
	 catch(NullPointerException e) {
		 return "Null Values Found";
	 }
	 catch(ArithmeticException e) {
		 return "No proper operator provided";
	 }
    return str1;
  }
  public static String doOperation(Activity a){
    String str="";
    String str1=a.string1;
    String str2=a.string2;
    switch(a.operator){
      case "+":
      str=str1.concat(str2);
      break;
      case "-":
    	  str=str1.replaceAll(str2,"");
    }
    return str;
  }
  
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...
    Activity a=new Activity("hellosworld","hello","/");
    System.out.println(handleException(a));
	}
}