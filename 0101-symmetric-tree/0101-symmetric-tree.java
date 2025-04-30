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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            TreeNode r1=q.poll();
            if(r1==null&&r==null)
              continue;
            if(r1==null||r==null)
              return false;
            if(r.val!=r1.val)
              return false;
            q.offer(r.left);
            q.offer(r1.right);
            q.offer(r.right);
            q.offer(r1.left);
        }
        return true;
    }
}