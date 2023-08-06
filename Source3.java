package collectionspract;
import java.util.*;
import java.io.*;
class NotEligibleException extends Exception {
	 public NotEligibleException (String str)  
	    {  
	        // calling the constructor of parent Exception  
	        super(str);  
	    }  
}
class CompanyJobRepository{
	String highestJobQualification;
	int age;
	public CompanyJobRepository( int age,String highestJobQualification){
		this.age=age;
		this.highestJobQualification=highestJobQualification;
	}
	public static String getJobPrediction(int age, String highestJobQualification) throws Exception {
		String str="";
		try {
		if(age<19) {
			throw new NotEligibleException("Must be atleast 19 years old");
		}
		else if(age>=21&&highestJobQualification.equals("B.E")) {
			str="We have openings for junior developer";
		}
		else if(age>=26&&(highestJobQualification.equals("M.S")||highestJobQualification.equals("PhD"))) {
			str="We have openings for senior developer";
		}
		else if(age>=19&&(!highestJobQualification.equals("M.S")||!highestJobQualification.equals("B.E")||!highestJobQualification.equals("PhD"))) {
			throw new NotEligibleException("We do not have any job that matches your qualifications");
		}
		else {
			str="Sorry we have no openings for now";
		}
		}
		catch(NotEligibleException e) {
			return ("Must be atleast 19 years old");
		}
		//catch(NotEligibleException s) {
			//return "We do not have any job that matches your qualifications";
		//}
		return str;
	}
}
public class Source3 {
	public static String searchForJob(int age, String highestQualification) throws Exception {
		//CompanyJobRepository cj;
		String str="";
		try {
		if (age >= 200||age <= 0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		else {
			str=CompanyJobRepository.getJobPrediction(age,highestQualification);
		}
		}
		catch(NotEligibleException e) {
			return "The age entered is not typical for a human being";
		}
		return str;
	}
public static void main(String[] argrs)throws Exception{
	CompanyJobRepository cj=new CompanyJobRepository(21,"B.E");
	int age=cj.age;
	String highestQualification=cj.highestJobQualification;
	System.out.println(searchForJob(age,highestQualification));
}
}
