class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0, rsum = 0;
        for(int i = 0;i<nums.length;i++) rsum+=nums[i];
        for(int i = 0;i<nums.length;i++) {
            rsum-=nums[i];
            if(lsum == rsum) return i;
            lsum+=nums[i];
        }
        return -1;
        // int idx = -1, j = 0;
        // while(j<nums.length){
        //     int sum1 = 0, sum2=0;
        //     for(int i =0;i<j;i++) sum1+=nums[i];
        //     for(int i =j+1;i<nums.length;i++) sum2+=nums[i];
        //     if(sum1==sum2) return j;
        //     j++;
        // }
        // return idx;
    }
}