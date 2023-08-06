package collectionspract;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.*;
class TransactionParty{
	String seller;
	String buyer;
	public TransactionParty() {
		seller=null;
		buyer=null;
	}
	public TransactionParty(String seller,String buyer) {
		this.seller=seller;
		this.buyer=buyer;
	}
}
class Receipt{
	TransactionParty tp;
	String productsQR;
	Receipt(TransactionParty tp,String productsQR){
		this.tp=tp;
		this.productsQR=productsQR;
	}
}
class GenerateReceipt{
	/*public int verifyParty(Receipt r){
		String str=r.tp.buyer;
		Pattern pattern=
		int n=0;
		return n;
	}*/
	public static String calcGST(Receipt r) {
		//String str="";
		int GST;
		String st=r.productsQR;
		 String parts[] = st.split("@");
		 //for(String i:parts)
			 //System.out.println(i);
		 String part1=parts[0];
		 String part2=parts[1];
		 String part3=parts[2];
		//System.out.println(part1+" "+part2+" "+part3);
		String p1[]=part1.split(",");
		String p2[]=part2.split(",");
		String p3[]=part3.split(",");
		int n=r.productsQR.length();
		int GST_Rate=12/100;
		String r1=p1[0];
		int Rate1=Integer.parseInt(r1);
		String Q1=p1[1];
		int Quantity1=Integer.parseInt(Q1);
		String R2=p2[0];
		int Rate2=Integer.parseInt(R2);
		String Q2=p2[1];
		int Quantity2=Integer.parseInt(Q2);
		String R3=p3[0];
		int Rate3=Integer.parseInt(R3);
		String Q3=p3[1];
		int Quantity3=Integer.parseInt(Q3);
		//System.out.println(r1+" "+Q1+" "+R2+" "+Q2+" "+R3+" "+Q3);
		GST = (Rate1 * Quantity1 + Rate2 * Quantity2 + Rate3)+(int)((Rate1 * Quantity1 + Rate2 * Quantity2 + Rate3 * Quantity3)*(12.0f/100.0f));
		System.out.println(GST);
		String str=Integer.toString(GST);
		return str;
	}
}
public class Source6{
	public static void main(String[] args) {
		TransactionParty tp=new TransactionParty("Suhruth","Krishna");
		Receipt r=new Receipt(tp,"250,10@100,3@50,7");
		System.out.println(GenerateReceipt.calcGST(r));
	}
}