class Solution {
    public int findDuplicate(int[] nums) {
        // int[] freq = new int[nums.length+1];
        // int res = 0;
        // for(int i =0;i<nums.length;i++) freq[nums[i]]++;
        // for(int i =0;i<nums.length+1;i++) if(freq[i] > 1) res = i;;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++) if(nums[i]==nums[i+1]) return nums[i];
        return 0;
    }
}