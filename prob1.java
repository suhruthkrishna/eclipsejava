package morepractice;
import java.util.*;
import java.io.*;
class NotValidException extends Exception{
	private String message;
	public NotValidException(String message) {
		super(message);
	}
}
class Person{
	private String loc;
	private String name;
	private double salary;
	public Person() {
		loc="";
		name="";
		salary=0;
	}
	public Person(String loc,String name,double salary) {
		this.loc=loc;
		this.name=name;
		this.salary=salary;
	}
	public String getloc() {
		return loc;
	}
	public void setloc(String loc) {
		this.loc=loc;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public String toString() {
		return loc+" "+name+" "+salary;
	}
	public Person buildPerson(String locationNameSalaryString){
		String s=locationNameSalaryString;
		Person p=new Person();
		//HydNMKiran-KumarSAL25
		int i=s.indexOf("NM");
		String loc=s.substring(0,i);
		int j=s.indexOf('-');
		String firstname=s.substring(i+2,j);
		int pos=s.indexOf("SAL");
		String lastname=s.substring(j+1,pos);
		String fullname=firstname+lastname;
		String salary=s.substring(pos+3,s.length());
		double sal=Double.parseDouble(salary);
		//System.out.println(loc+" "+fullname+" "+sal);
		p.setloc(loc);
		p.setname(fullname);
		p.setsalary(sal);
		return p;
		// write the logic to extract all properly and build Person object
		//refer next step to create Person object.
		}
	public static String findGrade(Person person){
		double salary=person.salary;
		String str="";
		salary=salary*1000;
		try {
		if(salary<10000) {
			str="C";
		}
		else if(salary>=1000&&salary<=25000) {
			str="B";
		}
		else if(salary>25000){
			str="A";
		}
		else {
			throw new NotValidException("Not a correct salary");
		}
		}
		catch(NotValidException e) {
			return "Not a correct salary";
		}
		return str;
		//write the logic by referring operations section
		//return grade as String
		}
}
public class prob1 {

public static void main(String[] argrs)throws IOException{
	
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Person p1=new Person();
	p1=p1.buildPerson(s);
	//String str=p1.toString();
	//System.out.println(str);
	//System.out.println(p2.toString());
	System.out.println(Person.findGrade(p1));
	
}
}

