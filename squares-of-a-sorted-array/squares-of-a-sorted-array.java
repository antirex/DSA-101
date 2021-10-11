//Runtime: 6 ms, faster than 12.70% of Java online submissions for Squares of a Sorted Array.
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}



// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int res[] = new int[nums.length];
//         for(int i =0;i<nums.length;i++){
//             res[i] = (int)Math.pow(nums[i],2);
//         }
//         Arrays.sort(res);
//         return res;
//     }
// }
