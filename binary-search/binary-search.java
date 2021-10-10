class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length;
        while(left<right){
            int mid = left + (right-left)/2;  //to avoid overflow
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) right = mid;
            else left = mid + 1;
        }
        return -1;
    }
}