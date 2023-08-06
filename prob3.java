package morepractice;
import java.util.*;
import java.io.*;
class OverflowException extends Exception{
	private String message;
	public OverflowException(String message) {
		super(message);
	}
}
class Bike{
	private String bikeName;
    private int tankCapacity;
    public Bike() {
    	bikeName="";
    	tankCapacity=0;
    }
    public Bike(String bikeName,int tankCapacity) {
    	this.bikeName=bikeName;
    	this.tankCapacity=tankCapacity;
    }
    public String getbikeName() {
    	return bikeName;
    }
    public void setbikeName(String bikeName) {
    	this.bikeName=bikeName;
    }
    public int gettankCapacity() {
    	return tankCapacity;
    }
    public void settankCapacity(int tankCapacity) {
    	this.tankCapacity=tankCapacity;
    }
}
class PetrolFilling{
	public static String fillPetrol(Bike bike, int noOfLiters){
		String str="";
		int tankCapacity=bike.gettankCapacity();
		try {
			if(noOfLiters<=0||noOfLiters>tankCapacity){
				throw new OverflowException("tank capacity is overflown");
			}
			else if(noOfLiters>1&&noOfLiters<=tankCapacity) {
				str="tank filled successfully";
			}
		}
		catch(OverflowException e){
			return e.getMessage();
		}
		return str;
		// write the logic to check noOfLiters <=0  and noOfLiters is higher than tankCapacity
                      // for more info: look at the operations sections
// use proper try and catch blocks to handle the exception
	}
}
public class prob3 {
public static void main(String[] argrs)throws IOException{
	Bike b1=new Bike();
	b1.setbikeName("Yamaha");
	b1.settankCapacity(1100);
	System.out.println(PetrolFilling.fillPetrol(b1,1600));
}
}
