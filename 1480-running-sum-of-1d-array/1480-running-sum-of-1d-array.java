class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int j =0, sum =0;
        while(j<nums.length){
            sum += nums[j];
            ans[j] = sum;
            j++;
        }
        return ans;
    }
}