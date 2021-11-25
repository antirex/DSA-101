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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return findSum(root, k, set);
    }
    private boolean findSum(TreeNode root, int k, HashSet<Integer> set){
        if(root==null) return false;
        if(set.contains(k - root.val)) return true;
        set.add(root.val);
        return findSum(root.left, k, set) || findSum(root.right, k, set);
    }
}