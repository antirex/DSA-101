class Solution {
    public int reverse(int x) {
        int rem,sum = 0;
        boolean neg = false;
        int limit = Integer.MAX_VALUE;
        if(x<0) {
            neg = true;
            x = Math.abs(x);
        }
        while(x>0){
            rem = x%10;
             if(sum>limit/10) return 0;
            sum = (sum*10) +rem;
            x =x/10;
        }
        if(neg){
            return -(sum);
        }else return (sum);
    }
}