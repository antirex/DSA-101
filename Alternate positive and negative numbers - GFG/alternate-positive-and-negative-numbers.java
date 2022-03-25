// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    void rearrange(int arr[], int n) {
        // code here
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) neg.add(arr[i]);
            if(arr[i]>=0) pos.add(arr[i]);
        }
        int j =0;
        while(pos.size()>0 && neg.size()>0){
            arr[j++] = pos.remove();
            arr[j++] = neg.remove();
        }
        while(pos.size()>0){
          arr[j++]=pos.remove();
        }
        while(neg.size()>0){
          arr[j++]=neg.remove();
        }
    }
}