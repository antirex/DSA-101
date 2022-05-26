class Solution {
    public int pivotIndex(int[] nums) {
        int idx = -1, j = 0;
        while(j<nums.length){
            int sum1 = 0, sum2=0;
            for(int i =0;i<j;i++) sum1+=nums[i];
            for(int i =j+1;i<nums.length;i++) sum2+=nums[i];
            if(sum1==sum2) return j;
            j++;
        }
        return idx;
    }
}