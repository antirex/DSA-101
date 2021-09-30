class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]< 0 && k>0){
                nums[i]= -1*nums[i];
                k--;
            }else if(nums[i]==0) k=0;
        }
        for(int i = 0;i<nums.length;i++) sum+=nums[i];
        if(k%2==0) return sum;
        else{
            Arrays.sort(nums);
            sum += -2*nums[0];
            return sum;
        } 
    }
}