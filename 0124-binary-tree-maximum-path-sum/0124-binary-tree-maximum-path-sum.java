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
    private int maxi=-1001;
    public int maxPathSum(TreeNode root) {
       Height(root);
       return maxi; 
    }
    public int Height(TreeNode root)
    {
        if(root==null)
          return 0;
          int left=Math.max(0,Height(root.left));
          int right=Math.max(0,Height(root.right));
          maxi=Math.max(maxi,left+right+root.val);
          return root.val+Math.max(left,right);
    }
}