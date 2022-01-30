class Solution {
    public int smallestEqual(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if((i % 10) == nums[i]) res = Math.min(res,i);
        }
        if(res == Integer.MAX_VALUE) res = -1;
        return res;
    }
}