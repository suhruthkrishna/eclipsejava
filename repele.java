package contests;

import java.util.*;
public class repele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        boolean f=false;
        while(T>0){
            T--;
            int n=sc.nextInt();
            int d=sc.nextInt();
            //System.out.println(n);//
            //System.out.println(d);//
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]<=d){
                    f=true;
                }
                //System.out.print(a[i]+" ")//
            }
            
            if(f=true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
