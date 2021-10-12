class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0) nums[zeroCounter++] = nums[i];
        }
        for(int i =zeroCounter;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}