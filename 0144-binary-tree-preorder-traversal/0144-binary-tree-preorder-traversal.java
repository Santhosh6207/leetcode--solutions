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
    
    public List<Integer> preorderTraversal(TreeNode root) { 
       List<Integer>al=new ArrayList<>();
        if(root==null)
           return al;
       Stack<TreeNode>st=new Stack<>();
       st.push(root);
       while(!st.isEmpty())
       {
          TreeNode node=st.pop();
          al.add(node.val);
          if(node.right!=null)
          {
            st.push(node.right);
          }
          if(node.left!=null)
          {
            st.push(node.left);
          }
       }
       return al;
    }
}