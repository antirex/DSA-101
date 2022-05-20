// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            
            System.out.println(new Solution().findNum(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean check(int t, int n){
        int ans = 0;
        int pow = 5;
        while((t/pow)>0){
            ans += t/pow;
            pow *= 5;
        }
        return (ans>=n);
    }
    int findNum(int n)
    {
        if(n==1) return 5;
        int left = 0;
        int right = 5*n;
        while(left<right){
            int mid = left + (right-left)/2;
            if(check(mid, n)) right = mid;
            else left = mid+1;
        }
        return left;
        
    }
}