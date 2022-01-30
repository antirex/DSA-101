class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr =  {-1,-1};
        arr[0] = firstFind(nums, target);
        arr[1] = lastFind(nums, target);
        return arr;
    }
    public int firstFind(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                res = mid;
                right = mid -1;
            }
            else if(nums[mid]>target) right = mid -1;
            else left = mid+1;
        }
        return res;
    }
    public int lastFind(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                res = mid;
                left = mid +1;
            }
            else if(nums[mid]>target) right = mid -1;
            else left = mid+1;
        }
        return res;
    }
}