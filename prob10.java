package threadprojec;

//package morepractice;
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
class WrongLengthException extends Exception{
	String message;
	public WrongLengthException(String message) {
		super(message);
	}
}
class InvalidPannumberException extends Exception{
	String message;
	public InvalidPannumberException(String message) {
		super(message);
	}
}
class Person{
	String firstName;//:String (Should have minimum 3 letters),
	String lastName; //: (Should have minimum 3 letters),
	String panNumber;
	//Should have exactly number of letters as with pattern which begins 
	//with 4letters then - symbol and 
	//then  4 digits(start with 0), then  @ symbol and 1Character(Capital
	//AZPK-0256@B
	public Person() {
		firstName="";
		lastName="";
		panNumber="";
	}
	public Person(String firstName,String lastName,String panNumber) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.panNumber=panNumber;
	}
}
class PersonIdentityImpl{
	public static Person validatePersonId(String fname,String lname,String panno) {
		Person p=new Person();
		try {
			if(fname.isEmpty()||lname.isEmpty()||panno.isEmpty()) {
				throw new NullPointerException("Null values found");
			}
			if(fname.length()<3||lname.length()<3||(panno.length()<11&&!panno.contains("-"))) {
				throw new WrongLengthException("Length provided does not meet the parameter");
			}
			if(!Pattern.matches("[A-Z]{4}[-][0][0-9]{3}[@][A-Z]{1}",panno)) {
				throw new InvalidPannumberException("Invalid Pan Number");
			}
			p.firstName=fname;
			p.lastName=lname;
			p.panNumber=panno;
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (WrongLengthException ex) {
			System.out.println(ex.getMessage());
		}
		catch (InvalidPannumberException exp) {
			System.out.println(exp.getMessage());
		}
		return p;
	}
	public static String findLocation(Person p) {
		String s="";
		String st=p.panNumber;
		int pos=st.indexOf("@");
		String str=st.substring(pos+1,st.length());
		System.out.println(str);
		switch(str) {
		case "B":
			s="Bangalore";
			break;
		case "C":
			s="Chennai";
			break;
		case "M":
			s="Mumbai";
			break;
		case "O":
			s="Other City";
			break;
		//default:
			//s="Wrong city mentioned";
			//break;
		}
		return s;
	}
}
public class prob10 {
public static void main(String[] argrs)throws IOException{
	Scanner sc=new Scanner(System.in);
	String firstname=sc.next();
	String lastname=sc.next();
	String panno=sc.next();
	Person p=new Person(firstname,lastname,panno);
	Person p2=PersonIdentityImpl.validatePersonId(p.firstName,p.lastName,p.panNumber);
	System.out.println(PersonIdentityImpl.findLocation(p2));
			
}
}

