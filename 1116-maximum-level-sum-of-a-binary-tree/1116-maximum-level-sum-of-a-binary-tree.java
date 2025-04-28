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
    public int maxLevelSum(TreeNode root) {
        if(root==null)
         return 0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int maxlevel=0;
        int maxsum=Integer.MIN_VALUE;
        int level=1;
        while(!q.isEmpty())
        {   
            int levelsum=0;
            int levelsize=q.size();
            for(int i=0;i<levelsize;i++)
            {
            TreeNode rem=q.poll();
            levelsum+=rem.val;
            if(rem.left!=null)
            {
                q.add(rem.left);
            }
            if(rem.right!=null)
             {
                q.add(rem.right);
             }
            }
             if(levelsum>maxsum)
             {
                maxsum=levelsum;
                maxlevel=level;
             }
             level++;
        }
        return maxlevel;
    }
}