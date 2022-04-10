// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        TreeSet<Character> chars = new TreeSet<>();//T1
        for(int i=0;i<S.length();++i) chars.add(S.charAt(i));
        List<String> res = new ArrayList<>();
        recur(chars, res, "");
        return res;
    }
    
    private void recur(
        TreeSet<Character> chars, 
        List<String> result, 
        String str
    ) {
        if (chars.isEmpty()) {
            result.add(str);
            return;
        }
        
        TreeSet<Character> chars2 = new TreeSet<>(chars);//T2
        for(Character ch: chars) {
            chars2.remove(ch);
            recur(chars2, result, str+ch);
            chars2.add(ch);
        }
    }
}