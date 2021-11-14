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
    public TreeNode dummy = null;
    public TreeNode searchBST(TreeNode root, int val) {
        recur(root, val); 
        return dummy;
         
    }
    private void recur(TreeNode root, int value){
        if(root == null) return;
        if(root.val == value) dummy = root;
        recur(root.left, value);
        recur(root.right, value);
    }
}