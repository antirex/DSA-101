class Solution {
    public int[] twoSum(int[] nums, int target) {
       // for(int i = 0 ; i < nums.length - 1 ; i++)
       //      for(int j = i + 1 ; j < nums.length ; j++)
       //      {
       //          if(nums[i] + nums[j] == target) return new int[]{i , j};
       //      }
       //  return new int[]{-1 , -1}; 
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[]  = new int[2];
        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                ans[1] = map.get(diff);
                ans[0] = i;
                return ans;
            } else map.put(nums[i], i);
        }
        return ans;
    }
}