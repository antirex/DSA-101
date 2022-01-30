class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            int mid = l + (r - l)/2;
            int dummy = nums[mid];
            if((dummy<nums[0]) == (target<nums[0])) dummy = nums[mid];
            else{
                dummy = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            if(dummy>target) r = mid -1;
            else if(dummy<target) l = mid + 1;
            else return mid;
        }
        return -1;
    }
}
 // int res = -1;
        // int shift = 0;
        // for(int i =0;i<nums.length-1;i++){
        //     if(nums[i]>nums[i+1]) shift = i+1;
        // }
        // for(int i = 0;i<nums.length; i++){
        //     if(nums[i] == target) return i;
        // }
        // return -1;