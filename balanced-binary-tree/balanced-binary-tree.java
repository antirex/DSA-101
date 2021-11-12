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
    public boolean isBalanced(TreeNode root) {
        int temp = recurHeight(root);
        if( temp == -1) return false;
        return true;
        }
    private int recurHeight(TreeNode root){
        if(root == null) return 0;
        int left = recurHeight(root.left);
        int right = recurHeight(root.right);
        if(left>=0 && right>=0 && Math.abs(left - right) <= 1) return Math.max(left,right)+1;
        return -1;
    }
}
    