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
        List<Integer>al=new ArrayList<>();
        if(root==null)
          return al;
          Queue<TreeNode>q=new LinkedList<>();
          q.offer(root);
          while(!q.isEmpty())
          {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode r=q.poll();
                if(i==n-1)
                {
                    al.add(r.val);
                }
                if(r.left!=null)
                {
                    q.offer(r.left);
                }
                if(r.right!=null)
                {
                    q.offer(r.right);
                }
            }
          }
          return al;
    }
}