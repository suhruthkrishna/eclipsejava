package morepractice;
import java.util.*;
import java.io.*;
class Mobile{
	String company;
	String model;
	public Mobile(String company,String model) {
		this.company=company;
		this.model=model;
	}
	static HashMap<String, ArrayList<String>> mobiles = new HashMap<String, ArrayList<String>>();
	public static String  addMobile(String company, String model) {
		String str="";
		ArrayList<String>models=new ArrayList<String>(mobiles.get(company));
		if(mobiles.containsKey(company)) {
			mobiles.get(company).add(model);
			str="model successfully added";
		}
		else {
			//models.add(model);
			
			//mobiles.putAll(company, mobiles.get(company).addAll(models));
			str="company and model added";
		}
		return str;
	}
	public static ArrayList<String> getModels(String company){
		ArrayList<String> models=new ArrayList<>(mobiles.get(company));
		return models;
	}
	public static String buyMobile(String company, String model) {
		String str="";
		ArrayList<String> models=new ArrayList<String>(mobiles.get(company));
		if(mobiles.containsKey(company)) {
			if(models.contains(model)) {
				str="mobile sold successfully";
			}
		}
		else if(!mobiles.containsKey(company)) {
			if(!models.contains(model)) {
				str="item not available";
			}
		}
		return str;
	}
}
public class prob8 {
public static void main(String[] argrs)throws Exception{
	Mobile obj = new Mobile("Oppo","K5");
	System.out.println(obj.addMobile("Oppo", "K3"));
	System.out.println(obj.getModels("Oppo"));
	System.out.println(obj.buyMobile("Oppo", "K3"));
}
}
