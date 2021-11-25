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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode dummy = new TreeNode();
        dummy = new TreeNode(root.val);
        recur(root, dummy);
        return dummy;
    }
    private void recur(TreeNode root, TreeNode dummy){
        if(root.left != null) {
            int leftToRight = root.left.val;
            dummy.right = new TreeNode(leftToRight);
            recur(root.left, dummy.right);
        }if(root.right != null){
            int rightToLeft = root.right.val;
            dummy.left = new TreeNode(rightToLeft);
            recur(root.right, dummy.left);
        }
    }
}