package practice;
import java.util.*;
import java.io.*;

// Java implementation to count ways  
// to sum up to a given value N
  
class tcsnqt1
{
    static int arr[] = {1,3,5,7};
      
    // method to count the total number
    // of ways to sum up to 'N'
    static int countWays(int N)
    {
        int count[] = new int[N + 1];
          
        // base case
        count[0] = 1;
          
        // count ways for all values up 
        // to 'N' and store the result
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)
      
                // if i >= arr[j] then
                // accumulate count for value 'i' as
                // ways to form value 'i-arr[j]'
                if (i >= arr[j])
                    count[i] += count[i - arr[j]];
          
        // required number of ways 
        return count[N]; 
          
    }
      
    // Driver code
    public static void main(String[] args) 
    {
        int N = 8;
        System.out.println("Total number of ways = "
                                    + countWays(N));
    }
}