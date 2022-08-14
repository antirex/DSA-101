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
    
    int count = 0;
    int ans = 0;
    
    public void findKthElement(TreeNode root, int k) {
        if(root==null) return;
        if(root.left != null) {
            findKthElement(root.left, k);
        }
        
        count++;
        if(count == k) {
            ans = root.val;
            return;
        }
        
        if(root.right != null) {
            findKthElement(root.right, k);
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
       
        findKthElement(root, k);
        
        return ans;
    }  
}
