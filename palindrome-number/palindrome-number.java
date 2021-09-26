class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = false;
        int r,sum=0,temp;   
        if (x<0) return ans;
        else{
            temp=x;    
            while(x>0){    
                r=x%10; 
                sum=(sum*10)+r;    
                x=x/10;    
            }
            if(sum == temp ) ans = true;
        }
        return ans;
    }
}