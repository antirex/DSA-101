class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt((long)c);
        while(start<=end){
            long res = start*start + end*end;
            if(res>c) end--;
            else if(res<c) start++;
            else return true;
        }
        return false;
    }
}