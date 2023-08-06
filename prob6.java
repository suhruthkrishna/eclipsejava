package morepractice;
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
class TransactionParty{
	String seller;
    String buyer;
    public TransactionParty(String seller,String buyer) {
    	this.seller=seller;
    	this.buyer=buyer;
    }
}
class Receipt{
	TransactionParty transactionParty;
    String productsQR;
    public Receipt(TransactionParty transactionParty, String productsQR) {
    	this.transactionParty=transactionParty;
    	this.productsQR=productsQR;
    }
}
class GenerateReceipt{
	public static int verifyParty(Receipt r){
		int sol=0;
		if(Pattern.matches("^[A-Za-z\\s-]+$",r.transactionParty.buyer)) {
			sol++;
		}
		if(Pattern.matches("^[A-Za-z\\\\s-]+$",r.transactionParty.seller)) {
			sol++;
		}
		return sol;
	}
	public static String calcGST(Receipt r) {
		String s="";
		int GST;
		String str=r.productsQR;
		String parts[]=str.split("@");
		//250,10@100,3@50,7
		String part1=parts[0];
		String part2=parts[1];
		String part3=parts[2];
		String h1[]=part1.split(",");
		String ra1=h1[0];
		String q1=h1[1];
		int Rate1=Integer.parseInt(ra1);
		int Quantity1=Integer.parseInt(q1);
		String h2[]=part2.split(",");
		String ra2=h2[0];
		String qa2=h2[1];
		String h3[]=part2.split(",");
		String ra3=h3[0];
		String qa3=h3[1];
		int Rate2=Integer.parseInt(ra2);
		int Quantity2=Integer.parseInt(qa2);
		int Rate3=Integer.parseInt(ra3);
		int Quantity3=Integer.parseInt(qa3);
		//int GST_Rate=(int) ((int)12.0f/100.0f);
		System.out.println(Rate1+" "+Quantity1+" "+Rate2+" "+Quantity2+" "+Rate3+" "+Quantity3);
		GST = (int)((Rate1 * Quantity1 + Rate2 * Quantity2 + Rate3 * Quantity3) * (12.0f/100.0f));
		s=Integer.toString(GST);
		return s;
	}
}
public class prob6 {
public static void main(String[] argrs)throws Exception{
	Scanner sc=new Scanner(System.in);
	String buyer=sc.next();
	String seller=sc.next();
	String productsQR=sc.next();
	TransactionParty tp=new TransactionParty(seller,buyer);
	Receipt r=new Receipt(tp,productsQR);
	System.out.println(GenerateReceipt.verifyParty(r));
	System.out.println(GenerateReceipt.calcGST(r));
	
}
}
