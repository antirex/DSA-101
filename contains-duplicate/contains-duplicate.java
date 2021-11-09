class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(set.add(nums[i])) continue;
            else return true;
        }
        return false;
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length;i++){
        //     int left = i+1;
        //     int right = nums.length;
        //     int temp = nums[i];
        //     while(left<right){
        //         int mid = left + (right - left)/2;
        //         if(nums[mid] == temp ) return true;
        //         else if(nums[mid]>temp) right = mid;
        //         else left = mid + 1;
        //     }
        // }
        // return false;
    }
}
