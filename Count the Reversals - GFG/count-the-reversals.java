// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
            if(st.isEmpty()) st.push(temp);
            else if(st.peek()=='{' && temp =='}') st.pop();
            else st.push(temp);
        }
        if(st.size()%2!=0) return -1;
        int res = 0;
        while(!st.isEmpty()){
            char t1 = st.peek();
            st.pop();
            char t2 = st.peek();
            st.pop();
            if(t1==t2) res++;
            else res+=2;
        }
        return res;
    }
}