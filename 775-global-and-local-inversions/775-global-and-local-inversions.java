class Solution {
    public boolean isIdealPermutation(int[] nums) {
       int max = -1;
       for(int i =0;i<nums.length-2;i++){
            max = Math.max(max, nums[i]);
           if(max>nums[i+2]) return false;
       }
       return true; 
    }
}


//  boolean ans = false;
//         int local = 0;
//         int global = 0;
//         for(int i =0;i<nums.length-1;i++){
//             if(nums[i]>nums[i+1]) local++;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]>nums[j]) global++;
//             }
//         }
//         if(local == global) ans = true;
//         return ans;