class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int countOdd = 1;
        int countEven = 0;
        int[] res = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[countEven] = nums[i];
                countEven += 2;
            }else{
                res[countOdd] = nums[i];
                countOdd += 2;
            }
        }
        return res;
    }
}