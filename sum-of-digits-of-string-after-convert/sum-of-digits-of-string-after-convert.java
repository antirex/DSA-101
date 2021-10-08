class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        int ans = 0;
        for(int i =0 ; i< s.length();i++){
            int c = s.charAt(i) - 96;
            String temp = Integer.toString(c);//here we get the string from numerical
            num += temp;//here we get the string after combining
        }
        while(k>0){
           ans = 0;
           for(int i =0;i<num.length();i++){
               ans += Character.getNumericValue(num.charAt(i)); //here we add the value of each char value by converting to integer 
           }
           k--;
           num = Integer.toString(ans); //here we reassign integer value and convert to string and save in num
        }
        return ans;
    }
}