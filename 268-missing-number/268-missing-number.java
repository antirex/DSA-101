class Solution {
    public int missingNumber(int[] nums) {
        int[] freq = new int[nums.length+1];
        int res = 0;
        for(int i =0;i<nums.length;i++) freq[nums[i]]++;
        for(int i =0;i<nums.length+1;i++) if(freq[i] == 0) res = i;
        return res;
    }
}