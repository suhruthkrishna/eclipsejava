package infytq;


	import java.util.*;
	import java.io.*;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;
public class infytq21 {
	    static int checkSum(int N){
	        int num=0;
	        int rem=0;
	        while(N!=0){
	            rem=N%10;
	            num=num+rem;
	        }
	        return num;
	    }
	    static int checkDig(int N){
	        int count=0;
	        if(N==0){
	            return 1;
	        }
	        while(N!=0){
	            count++;
	            N=N/10;
	        }
	        return count;
	    }
	   public static void main (String[] args) {
	      /* code */
	      Scanner sc=new Scanner(System.in);
	      String s=sc.next();
	      int sum=0;
	      int dig=0;
	      int ans=0;
	      int res=0;
	      for(int i=0;i<s.length();i++){
	          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
	              res=i*5;
	              sum=checkSum(res);
	              System.out.println(sum);
	              dig=checkDig(sum);
	              if(dig>1){
	                ans=checkSum(sum);  
	              }
	          }
	      }
	      System.out.println(ans);
	  }
	}
