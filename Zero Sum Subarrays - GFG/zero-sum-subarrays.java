// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}
// } Driver Code Ends

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long, Long> map = new HashMap<>();
        long count = 0;
        long sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0) count++;
            count+=map.getOrDefault(sum, (long)0);
            map.put(sum, map.getOrDefault(sum, (long)0)+(long)1);
        }
        return count;
    }
}
//using sliding window but doesn't work
//  long res = 0;
//         int j = 0, i =0, sum = 0;
//         while(j<n){
//             sum+=arr[j];
//             if(sum == 0){
//                 res++;
//                 j++;
//             }else if(sum>0){
//                 while(sum>0){
//                     sum-=arr[i];
//                     if(sum == 0) res++;
//                     i++;
//                 }
//                 j++;
//             }else j++;
//         }
//         return res;