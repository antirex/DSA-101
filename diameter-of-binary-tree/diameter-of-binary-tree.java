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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        recur(root);
        return dia;
    }
    private int recur(TreeNode root){
        if(root == null) return 0;
        int leftH = recur(root.left);
        int rightH = recur(root.right);
        dia = Math.max(dia, leftH+rightH);
        return Math.max(leftH, rightH)+1;
    }
}