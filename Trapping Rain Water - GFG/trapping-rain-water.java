// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        long[] ans = new long[(int) n];
        long res = 0;
        long[] left = maxLeft(arr);
        long[] right = maxRight(arr);
        for(int i =1;i<n-1; i++){
            ans[i] = Math.min(left[i], right[i]) - arr[i];
            res = res + ans[i];
        }
        return res;
    } 
    public static long[] maxLeft(int arr[]){
        long[] res = new long[(int) arr.length];
        res[0] = arr[0];
        for(int i=1;i<arr.length;i++) res[i] = Math.max(res[i-1],arr[i]);
        return res;
    }
    public static long[] maxRight(int arr[]){
        long[] res = new long[(int) arr.length];
        res[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) res[i] = Math.max(res[i+1],arr[i]);
        return res;
    }
}


