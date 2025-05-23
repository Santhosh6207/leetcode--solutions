/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
          return root;
       Queue<Node>q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty())
       {
        int n=q.size();
        for(int i=0;i<n;i++)
        {
             Node r=q.poll();
             if(i!=n-1)
             {
                r.next=q.peek();
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
       return root;
    }
}