/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recur(0, nums.length, nums);
    }
    private TreeNode recur(int Lidx, int Hidx, int[] nums){
        if(Lidx >= Hidx) return null;
        int idx = maxIdx(nums, Lidx, Hidx);
        TreeNode result = new TreeNode(nums[idx]);
        result.left = recur(Lidx,idx,nums);
        result.right = recur(idx+1,Hidx,nums);
        return result;
    }
    private int maxIdx(int[] nums, int Lidx, int Hidx){
        int idx = Lidx;
        for(int i =Lidx+1;i<Hidx;i++){
            if(nums[i]>nums[idx]) idx = i;;
        }
        return idx;
    }
}