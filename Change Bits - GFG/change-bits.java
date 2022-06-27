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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[] ans = ob.changeBits(N);
            System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] changeBits(int N) {
        // code here
        long dum = N;
        int ans[] = new int[2];
        int zeroes = 0;
        while (N != 0)
        {
            zeroes++;
            N >>= 1;
        }
        // while(N>0){
        //     int rem = N%2;
        //     if(rem == 0) zeroes++;
        //     N/=2;
        // }
        // Integer.toBinaryString(N);
        // zeroes += Integer.bitCount(N);
        // System.out.println(zeroes);
        long rand = 0;
        rand += Math.pow(2, zeroes)-1;
        ans[0] = (int) Math.abs(rand - dum);
        ans[1] = (int) rand;
        return ans;
    }
};