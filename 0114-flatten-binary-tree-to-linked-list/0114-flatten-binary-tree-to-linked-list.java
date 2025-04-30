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
    Queue<TreeNode>q=new LinkedList<>();
    public void flatten(TreeNode root) {
        helper(root);
        // if (q.isEmpty()) return;
        TreeNode help=q.poll();
        while(!q.isEmpty())
        {
            TreeNode next=q.poll();
            help.left=null;
            help.right=next;
            help=next;
        }
        
 }
 public void helper(TreeNode root)
 {
       if(root==null)
         return ;
         q.offer(root);
         helper(root.left);
         helper(root.right);
}
}