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
    List<Integer>al=new ArrayList<>();
    List<Integer>al2=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) { 
        ArrayList<Integer>al3=new ArrayList<>();
        inorder(root1);
        inorder2(root2);
        Collections.sort(al);
        Collections.sort(al2);
        int i=0,j=0;
        while(i<al.size()&&j<al2.size())
        {
            if(al.get(i)>al2.get(j))
            {
                al3.add(al2.get(j));
                j++;
            }
            else if(al.get(i)<al2.get(j))
            {
                al3.add(al.get(i));
                i++;
            }
            else
            {
                al3.add(al.get(i));
                al3.add(al2.get(j));
                i++;
                j++;
            }

        }
        while(i<al.size())
        {
            al3.add(al.get(i));
            i++;
        }
        while(j<al2.size())
        {
            al3.add(al2.get(j));
            j++;
        }
        return al3;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
          return ;
          inorder(root.left);
          al.add(root.val);
          inorder(root.right);
    }
    public void inorder2(TreeNode root)
    {
        if(root==null)
          return ;
          inorder2(root.left);
          al2.add(root.val);
          inorder2(root.right);
    }
}