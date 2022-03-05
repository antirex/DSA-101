// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    static class Pair{
        long a, b;
        Pair(long a, long b){
            this.a = a;
            this.b = b;
        }
        
    }
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long res = -1;
        long[] left = nearestLeft(hist, n);
        long[] right = nearestRight(hist, n);
        for(int i=0;i<n;i++){
            if(right[i]==-1) right[i] = n;
            long area = hist[i]*(right[i] - left[i] - 1);
            res = Math.max(res, area);
        }
        return res;
    }
    public static long[] nearestLeft(long hist[], long n){
        Stack<Pair> st = new Stack<>();
        long[] res = new long[(int) n];
        for(int i =0;i<n;i++){
            if(st.isEmpty()) res[i] = (long) -1;
            else if(st.peek().a<hist[i]) res[i] = st.peek().b;
            else if(st.peek().a>=hist[i]){
                while(!st.isEmpty() && st.peek().a>=hist[i]) st.pop();
                if(st.isEmpty()) res[i] = (long) -1;
                else res[i] = st.peek().b;
            }
            st.push(new Pair(hist[i], i));
        }
        return res;
    }
    public static long[] nearestRight(long hist[], long n){
        Stack<Pair> st = new Stack<>();
        long[] res = new long[(int) n];
        for(int i =((int) n)-1;i>=0;i--){
            if(st.isEmpty()) res[i] = (long) -1;
            else if(st.peek().a<hist[i]) res[i] = st.peek().b;
            else if(st.peek().a>=hist[i]){
                while(!st.isEmpty() && st.peek().a>=hist[i]) st.pop();
                if(st.isEmpty()) res[i] = (long) -1;
                else res[i] = st.peek().b;
            }
            st.push(new Pair(hist[i], i));
        }
        return res;
    }
}



