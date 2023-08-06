package infytq;


import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;
class infytq17{
    //Length of the fibonnaci series
    static int LongestfibSeq(int arr[],int n){
        TreeSet<Integer>S=new TreeSet<>();
        for(int k=0;k<n;k++){
            S.add(k);
        }
        int maxL=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int num1=arr[j];
                int num2=arr[i]+arr[j];
                int length=3;
                while(S.contains(num2)&&num2!=S.last()){
                    int sum=num1+num2;
                    num1=num2;
                    num2=sum;
                    length++;
                    maxL=Math.max(maxL,length);
                }
            }
        }
        return maxL>=3?maxL:0;
        }
        public static void main(String args[])throws Exception{
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int res=LongestfibSeq(arr,n);
            System.out.println(res);
            sc.close();
        
    }
}
