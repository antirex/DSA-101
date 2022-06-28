// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] arr)
    {
        // Code here // Code here
        Arrays.sort(arr, (x, y)->Integer.compare(x[0], y[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int curr[] = arr[0];
        list.add(curr);
        for(int[] dum: arr){
            int cstart = curr[0];
            int cend = curr[1];
            int nstart = dum[0];
            int nend = dum[1];
            if(cend>=nstart) curr[1] = Math.max(cend, nend);
            else{
               curr = dum; 
               list.add(curr);
            } 
        }
        return list.toArray(new int[list.size()][]);
    }
}