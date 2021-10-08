class Solution {
    public int addDigits(int num) {
        if(num == 0)return 0;
        int temp = divide(num);
        if(temp>0 && temp<=9) return temp;
        return(addDigits(temp));
    }
    private int divide(int n){
        int ans = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            ans += rem;
            n=n/10;
        }
        return ans;
    }
}

        // String numStr = Integer.toString(num);
        // int ans = 0;
        // while(numStr.length()!=0){
        //     ans = 0;
        //     for(int i =0;i<numStr.length();i++){
        //         ans += Character.getNumericValue(numStr.charAt(i));
        //     }
        //     numStr = Integer.toString(ans);
        // }
        // return ans;