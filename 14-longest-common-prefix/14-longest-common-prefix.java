class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String res = "";
        String first = str[0];
        String last = str[str.length-1];
        int count = 0;
        while(count<first.length()){
            if(first.charAt(count)==last.charAt(count)){
                count++;
            } else break;
        }
        return first.substring(0,count);
    }
}