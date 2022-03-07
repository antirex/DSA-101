// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    static class Pair{
        int a, b;
        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        
    }
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int[] arr = new int[m];
        for(int j =0;j<m;j++){
            arr[j] = M[0][j];
        }
        int max = maxAreaHist(arr, m);
        for(int i =1;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j] == 0) arr[j] = 0;
                else arr[j] = arr[j] + M[i][j];
            }
        max = Math.max(maxAreaHist(arr, m), max);
        }
        return max;
    }
    public static int maxAreaHist(int hist[], int n) 
    {
        // your code here
        int res = -1;
        int[] left = nearestLeft(hist, n);
        int[] right = nearestRight(hist, n);
        for(int i=0;i<n;i++){
            if(right[i]==-1) right[i] = n;
            int area = hist[i]*(right[i] - left[i] - 1);
            res = Math.max(res, area);
        }
        return res;
    }
    public static int[] nearestLeft(int hist[], int n){
        Stack<Pair> st = new Stack<>();
        int[] res = new int[n];
        for(int i =0;i<n;i++){
            if(st.isEmpty()) res[i] =-1;
            else if(st.peek().a<hist[i]) res[i] = st.peek().b;
            else if(st.peek().a>=hist[i]){
                while(!st.isEmpty() && st.peek().a>=hist[i]) st.pop();
                if(st.isEmpty()) res[i] =-1;
                else res[i] = st.peek().b;
            }
            st.push(new Pair(hist[i], i));
        }
        return res;
    }
    public static int[] nearestRight(int hist[], int n){
        Stack<Pair> st = new Stack<>();
        int[] res = new int[n];
        for(int i =n-1;i>=0;i--){
            if(st.isEmpty()) res[i] = -1;
            else if(st.peek().a<hist[i]) res[i] = st.peek().b;
            else if(st.peek().a>=hist[i]){
                while(!st.isEmpty() && st.peek().a>=hist[i]) st.pop();
                if(st.isEmpty()) res[i] = -1;
                else res[i] = st.peek().b;
            }
            st.push(new Pair(hist[i], i));
        }
        return res;
    }
    
}