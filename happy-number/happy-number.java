class Solution {
    public boolean isHappy(int n) {
        return isHappyRecur(n, new HashSet());
    }
    private boolean isHappyRecur(int n, HashSet<Integer> h){
        int temp = convert(n);
        if(temp == 1) return true;
        else if(!h.add(temp)) return false;
        return isHappyRecur(temp,h);
    }
    public int convert(int num){
        int rem =0, sum = 0;
        while(num>0){
            rem = num%10;
            sum += Math.pow(rem,2);
            // if(sum == 1) return true;
            num = num/10;
        }
        return sum;
    }
}