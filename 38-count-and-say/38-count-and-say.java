class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for(int i =1;i<n;i++){
            str = solve(str);
        }
        return str;
    }
    public String solve(String s){
        StringBuilder dum = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
            else
            {
                dum.append(count);
                dum.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        dum.append(count);
        dum.append(c);
        return dum.toString();
    }
}