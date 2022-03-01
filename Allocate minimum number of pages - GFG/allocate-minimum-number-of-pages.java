// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int n,int k)
    {
        //Your code here
        int start = findStart(arr, n);
        int end = findSum(arr, n);
        int res = -1;
        if(n<k) return res;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isValid(arr, n, k, mid)){
                res = mid;
                end = mid-1;
            } 
            else start = mid+1;
        }
        return res;
    }
    public static int findStart(int[] arr, int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static int findSum(int[] arr, int n){
        int sum = 0;
        for(int i =0;i<n;i++) sum+=arr[i];
        return sum;
    }
    public static boolean isValid(int[] arr, int n, int k, int max){
        int students = 1;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
              students++;
              sum = arr[i];  
            } 
        }
        if(students>k) return false;
        return true;
    }
    
};