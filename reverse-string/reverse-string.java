class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while(l<r){
            char temp1 = s[l];
            char temp2 = s[r];
            s[r] = temp1;
            s[l] = temp2;
            l++;
            r--;
        }
    }
}