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
    public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> qu = new LinkedList<>();
       List<List<Integer>> list = new ArrayList<>();
       if(root == null) return list;
       qu.add(root);
       while(!qu.isEmpty()){
           List<Integer> subList = new ArrayList<>();
           int n = qu.size();
           for(int i =0;i<n;i++){
                TreeNode node = qu.remove();
                if(node.left != null) qu.add(node.left);
                if(node.right != null) qu.add(node.right);
                subList.add(node.val);
           }
           
           list.add(subList);
          
       }
         
        
        return list;
    }
}