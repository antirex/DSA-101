// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<S.length();i++){
            char ch = S.charAt(i);
            if(Character.isDigit(ch)) st.push(Character.getNumericValue(ch));
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                 int t1=st.pop();
                 int t2=st.pop();
                 if(ch=='+') st.push(t1+t2);
                 else if(ch=='-') st.push(t2-t1);
                 else if(ch=='*') st.push(t1*t2);
                 else if(ch=='/') st.push(t2/t1);
            }
        }
        return st.pop();
    }
}