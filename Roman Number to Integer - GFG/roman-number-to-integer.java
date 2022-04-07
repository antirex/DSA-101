// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        for(int i =0;i<str.length()-1;i++){
            char temp1 = str.charAt(i);
            char temp2 = str.charAt(i+1);
            if(map.get(temp1)<map.get(temp2)) res-=map.get(temp1);
            else res+=map.get(temp1);
        }
        res += map.get(str.charAt(str.length() - 1));
        return res;
    }
}