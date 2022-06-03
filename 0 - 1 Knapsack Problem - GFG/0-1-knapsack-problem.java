// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    // static int[][] t = new int[1002][1002];
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        // Recursive Solution 
        //  if(n == 0 || W == 0) return 0;
        //  if(wt[n-1]<=W) return Math.max(knapSack(W, wt, val, n-1), val[n-1] + knapSack(W-wt[n-1], wt, val, n-1));
        //  else return knapSack(W, wt, val, n-1);
        
        // DP Solution - memorization
        // if(n == 0 || W == 0) return 0;
        // if(t[n][W]!=0) return t[n][W];
        // if(wt[n-1]<=W) return t[n][W] = Math.max(knapSack(W, wt, val, n-1), val[n-1] + knapSack(W-wt[n-1], wt, val, n-1));
        // else return t[n][W] = knapSack(W, wt, val, n-1);
        int[][] t = new int[n+1][W+1];
        for(int i =0;i<=n;i++){
            for(int j = 0;j<=W;j++){
                if(j==0 || i==0) t[i][j] = 0;
                else if(wt[i-1]<=j) t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
                else t[i][j] = t[i-1][j];
            }
        }
        return t[n][W];
        
        // if(n == 0 || W == 0) return 0;
        // if(t[n][W]!=0) return t[n][W];
        // if(wt[n-1]<=W) return t[n][W] = Math.max(knapSack(W, wt, val, n-1), val[n-1] + knapSack(W-wt[n-1], wt, val, n-1));
        // else return t[n][W] = knapSack(W, wt, val, n-1);
    } 
}


