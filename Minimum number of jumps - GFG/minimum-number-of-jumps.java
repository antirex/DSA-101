// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
      int n = arr.length;
      int count = 0;
      int jump = 0;
      int newJump = 0;
      int i = 0;
      
      for(i=0;i<n-1;i++){
          if(i+arr[i] > jump)
              jump = i+arr[i];
          if(i==newJump){
              count++;
              newJump=jump;
          }
          
          if(arr[i] == 0 && i==jump)
             return -1;
              
          }
          return count;
    }
}