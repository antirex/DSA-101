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
    public boolean isUnivalTree(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        recur( root,  set);
        if(set.size() != 1) return false;
        return true;
    }
    private void recur(TreeNode root, HashSet set){
        if(root == null) return;
        set.add(root.val);
        recur(root.left, set);
        recur(root.right, set);
    }
}