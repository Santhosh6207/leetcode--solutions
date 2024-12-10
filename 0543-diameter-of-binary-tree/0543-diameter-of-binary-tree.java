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
    public int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
         Height(root);
         return diameter;
        
    }
    public int Height(TreeNode root)
    {
        if(root==null)
          return 0;
    
    int left=Height(root.left);
    int right=Height(root.right);
    diameter = Math.max(diameter,left+right);
    return 1+Math.max(left,right);
    }
}