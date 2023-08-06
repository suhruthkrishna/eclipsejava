package collectionspract;
import java.util.*;
import java.io.*;
class Person{
	private String loc;
	private String name;
	private double salary;
	public Person() {
		 loc="";
	     name="";
	     salary=0;
	}
	  public Person(String loc, String name, double salary) {
		  super();
	        this.loc = loc;
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getloc() {
	        return loc;
	    }

	    public void setloc(String loc) {
	        this.loc = loc;
	    }

	    public String getname() {
	        return name;
	    }

	    public void setname(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    public String toString(){//overriding the toString() method  
	    	  return loc+" "+name+" "+salary;  
	    	 }  
	    public Person buildPerson(String locationNameSalaryString){
	    	Person p=new Person();
	    	String n=locationNameSalaryString;
	    	int num=n.length();
	    	String loc=n.substring(0,3);
	    	int n1=n.indexOf('-');
	    	String name=n.substring(5,n1);
	    	String name1=n.substring(n1+1,num-5);
	    	String fullname=name+name1;
	    	int pos=n.indexOf("SAL");
	    	String salary=n.substring(pos+3,num);
	    	double salary1 = Double.parseDouble(salary);
	    	p.setloc(loc);
	    	p.setname(fullname);
	    	p.setSalary(salary1);
	    	//System.out.println();
	    	System.out.println(loc+" "+fullname+" "+salary1);
	    	return p;
	    	// write the logic to extract all properly and build Person object
	    	//refer next step to create Person object.
	    	}
	    public String findGrade(Person person){
	    	String str="";
	    	System.out.println(person.salary);
	    	double salary=person.salary;
	    	salary=salary*1000;
	    	System.out.println(salary);
	    	if(salary>25000) {
	    		str="A";
	    	}
	    	else if(salary>=10000&&salary<=25000) {
	    		str="B";
	    	}
	    	else if(salary<10000){
	    		str="C";
	    	}
	    	return str;
	    	//write the logic by referring operations section
	    	//return grade as String
	    	}
	}

public class Source5 {

public static void main(String[] argrs)throws IOException{
	Person p1=new Person();
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Person p2=p1.buildPerson(s);
	//String str=p1.toString();
	//System.out.println(str);
	//System.out.println(p1);
	System.out.println(p1.findGrade(p2));
}
}
