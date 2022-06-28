// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        if(a.length()!=b.length()) return false;
        for(int i =0;i<a.length();i++){
            char temp = a.charAt(i);
            if(map.containsKey(temp)) map.put(temp, map.get(temp)+1);
            else map.put(temp, 1);
        }
        for(int i =0;i<b.length();i++){
            char temp = b.charAt(i);
            if(map.containsKey(temp) && map.get(temp)>0) map.put(temp, map.get(temp)-1);
            else return false;
        }
        // System.out.println(map);
        return true;
        
    }
}