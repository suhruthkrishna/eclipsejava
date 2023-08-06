package basics;
import java.util.*;
import java.io.*;

public class basics4 {
public static void main(String[] argrs)throws IOException{
Scanner sc=new Scanner(System.in);
//Selection, Iteration
//Selection->Two values or more based on a criteria you select a value out of it
//Selection->If, Switch

//IF
int a=1000;
/*
if(a>100) {
	System.out.println("A is acceptable");
	//System.out.println();
}
else {
	System.out.println("NO");
}*/
int b=500;
int d=0;
String s=sc.next();
char c=s.charAt(0);
//Hello World , 0th character=H
//H, 0th character=H
switch(c) {
case ('+'):
	d=a+b;
break;
case ('-'):
	d=a-b;
break;
default:
	System.out.println("The end");
	
}


System.out.println(d);
}
}
