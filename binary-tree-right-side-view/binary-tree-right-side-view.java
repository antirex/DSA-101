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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int height = 0;
        recur(root,list,height);
        return list;
    }
    private void recur(TreeNode root, List list, int height){
        if(root == null) return;
        if(list.size() == height) list.add(root.val);
        recur(root.right, list, height+1);
        recur(root.left, list, height+1);
    }
}