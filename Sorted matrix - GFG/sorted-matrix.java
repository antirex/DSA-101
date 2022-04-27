// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int v[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < N; j++) v[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            int ans[][] = ob.sortedMatrix(N, v);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<Mat.length;i++){
            for(int j = 0;j<Mat[0].length;j++) pq.add(Mat[i][j]);
        }
        while(pq.size()>0){
            for(int i =0;i<Mat.length;i++){
                for(int j = 0;j<Mat[0].length;j++) Mat[i][j] = pq.remove();
            }
        }
        return Mat;
    }
};