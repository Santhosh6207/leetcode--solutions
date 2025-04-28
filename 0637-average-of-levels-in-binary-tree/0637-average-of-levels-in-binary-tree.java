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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null)
         return new ArrayList<>();
        List<Double>al=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            double levelsum=0;
            for(int i=0;i<size;i++)
            {
                 TreeNode r=q.poll();
                 if(r.left!=null)
                   q.offer(r.left);
                   if(r.right!=null)
                   {
                    q.offer(r.right);
                   }
                   levelsum+=r.val;
            }
            al.add(levelsum/size);
        }
        return al;
    }
}