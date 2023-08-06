package morepractice;
import java.util.*;
import java.io.*;
class NotEligibleException extends Exception{
	private String message;
	public NotEligibleException(String message) {
		super(message);
	}
}
class CompanyJobRepository{
	public static String getJobPrediction(int age, String highestQualification) {
		String s=highestQualification;
		String str="";
		try{
			if(age<19) {
				throw new NotEligibleException("you are underage");
		}
			else if(age>=21&&s.equals("B.E")) {
				str="We have openings for junior developer";
			}
			else if(age>=26&&(s.equals("M.S")||s.equals("PhD"))) {
				str="We have openings for senior developer";
			}
			else if(age>=19&&(s.equals("B.E")||s.equals("M.S")||s.equals("PhD"))) {
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			}
			else {
				str="Sorry we have no openings for now";
			}
		}
		catch(NotEligibleException e) {
			return(e.getMessage());
			
		}
		
		return str;
	}
}
public class prob4 {
public static String searchForJob(int age, String highestQualification) {
	String s=highestQualification;
	String res="";
	try {
		if(age >= 200||age <= 0) {
			throw new NotEligibleException("Not a valid age");
		}
		else {
			res=CompanyJobRepository.getJobPrediction(age,s);
		}
	}
	catch(NotEligibleException e) {
		return "Not a vaild age";
	}
	return res;
}
public static void main(String[] argrs)throws IOException{
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	String s=sc.next();
	System.out.println(searchForJob(age,s));
}
}
