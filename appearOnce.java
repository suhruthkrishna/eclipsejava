import java.util.*;
import java.io.*;

public class Search{
    static void search(int ar[], int n)
    {
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if(entry.getValue() == 1) {
             res = entry.getKey();
             break;
          }
      }
      System.out.println(res);

    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            //Arrays.sort(ar);
        }
        search(ar,n);
    }
}
