// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int range = 0, min = Integer.MAX_VALUE;
	    for(int i = 0;i<n;i++) range+=arr[i];
	    ArrayList<Integer> res = subSetSum(arr, n, range);
	    for(int i =0;i<res.size();i++) min = Math.min(min, range-(2*res.get(i)));
	    return min;
	} 
	public ArrayList<Integer> subSetSum(int arr[], int n, int sum){
	    boolean t[][] = new boolean[n+1][sum+1];
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i =0;i<=n;i++){
            for(int j =0;j<=sum;j++){
                if(i==0) t[i][j] = false;
                if(j==0) t[i][j] = true;
            }
        }
	    for(int i = 1;i<=n;i++){
	        for(int j = 1;j<=sum;j++){
	            if(arr[i-1]<=j) t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
	            else t[i][j] = t[i-1][j];
	        }
	    }
	    int count = 0;
	    for(int j = 0;j<=sum/2;j++){
	          if(t[n][j]) list.add(j);
	    }

	    return list;
	}
}
