// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] res = new long[n];
        int zeroCount = 0;
        long prod = 1;
        for(int i =0;i<n;i++){
            if(nums[i]!=0) prod = prod*((long) nums[i]);
            else zeroCount++;
        } 
        for(int i =0;i<n;i++){
            if(zeroCount>1) res[i]=0;
            else if(zeroCount==1 && nums[i]!=0) res[i]=0;
            else if(nums[i]!=0 && zeroCount==0) res[i] =prod/(long) nums[i];  
            else res[i] =prod;
        //   if(nums[i]!=0 && zeroCount==1) res[i] = 0;
        //   else if(zeroCount>1) res[i]
        //   else if(nums[i]!=0) res[i] =prod/(long) nums[i];  
        //   else res[i] =prod;
        } 
        return res;
	} 
} 
