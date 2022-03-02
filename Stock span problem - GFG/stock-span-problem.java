// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends

class Solution
{
    static class Pair{
        int a, b;
        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] res = new int[n];
        Stack<Pair> st = new Stack<>();
        for(int i =0; i<n; i++){
            if(st.isEmpty()) res[i] = -1;
            else if(price[i]<st.peek().a) res[i] = st.peek().b;
            else if(price[i]>=st.peek().a){
                while(!st.isEmpty() && price[i]>=st.peek().a) st.pop();
                if(st.isEmpty()) res[i] = -1;
                else res[i] = st.peek().b;
            }
            st.push(new Pair(price[i], i));
        }
        for(int i =0;i<n;i++){
            res[i] = i - res[i];
        }
        return res;
    }
    
}