// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int n) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        int ones = 0;
        int zeroes = 0;
        solve(res, "" ,ones, zeroes, n);
        return res;
    }
    void solve(ArrayList<String> res,String s, int ones, int zeroes, int n){
        if(n==0){
            res.add(s);
            return;
        }
        String op1 = s + '1';
        solve(res, op1, ones+1, zeroes, n-1);
        if(ones>zeroes){
            String op2 = s + '0';
            solve(res, op2, ones, zeroes+1, n-1);
        }
    }
}