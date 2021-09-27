class Solution {
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        int sum = 0;
        int carry = 1;
        int res[] = new int[count];
        for(int i =count-1; i>=0; i--){
            sum=digits[i]+carry;
            if(sum<=9){
                res[i] = sum;
                carry  = 0;
            }else{
                carry = 1;
            }
        }
        if(carry == 1){
            int res2 []= new int[count +1];
            res2[0]= 1;
            return res2;
        }
        return res;
    }
}