// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        String res = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i], 1);
            else map.put(arr[i], map.get(arr[i])+1);
        }
        int max = 0;
        for(int i =0;i<arr.length;i++) if(max<map.get(arr[i])) max = map.get(arr[i]);
        int secMax = 0;
        for(int i =0;i<arr.length;i++){
           if(map.get(arr[i])>secMax && max>map.get(arr[i])){
             secMax = map.get(arr[i]);
             res = arr[i];
           } 
        }
        return res;
    }
}