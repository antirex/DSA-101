class Solution {
    public int maximumDifference(int[] nums) {
        int minPrice = nums[0];
        int profit = Integer.MIN_VALUE;
        for(int i =1;i<nums.length;i++){
            minPrice = Math.min(minPrice, nums[i]);
            int diff = -1;
            if(nums[i] - minPrice>0) diff = nums[i] - minPrice;
            profit = Math.max(profit, diff);
        }
        return profit;
    }
}