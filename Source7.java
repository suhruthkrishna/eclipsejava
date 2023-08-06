package collectionspract;
import java.util.*;
import java.io.*;

class OverflowException extends Exception{
	private String Message;
	OverflowException(String Message){
		this.Message=Message;
	}
}
class Bike{
	private String bikeName;
    private int tankCapacity;
    public Bike(){
    	bikeName=null;
    	tankCapacity=0;
    }
    public Bike(String bikeName,int tankCapacity) {
    	this.bikeName=bikeName;
    	this.tankCapacity=tankCapacity;
    }
    public String getbikeName() {
    	return bikeName;
    }
    public void setBikeName() {
    	this.bikeName=bikeName;
    }
    public int gettankCapacity() {
    	return tankCapacity;
    }
    public void settankCapacity() {
    	this.tankCapacity=tankCapacity;
    }
}
class PetrolFilling{
	public static String fillPetrol(Bike bike, int noOfLiters){
		String str="";
		// write the logic to check noOfLiters <=0  and noOfLiters is higher than tankCapacity
                      // for more info: look at the operations sections
// use proper try and catch blocks to handle the exception
		int capacity=bike.gettankCapacity();
		try {
			if(noOfLiters<=0||noOfLiters>capacity) {
				throw new OverflowException("tank capacity is overflown");
			}
			else if( noOfLiters>1&&noOfLiters<=capacity){
				str="tank filled successfully";
			}	
		}
		catch(OverflowException e){
			return "tank capacity is overflown";
		}
		return str;
}
}

public class Source7 {
	public static void main(String[] argrs)throws IOException{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Bike b=new Bike("Yamaha",1300);
		String res=PetrolFilling.fillPetrol(b,n);
		System.out.println(res);
	}
	}
