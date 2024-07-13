/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
          HashMap<ListNode,Boolean>hm=new HashMap<>();
        ListNode temp=head;
        while(temp!=null&&temp.next!=null)
        {
            if(hm.containsKey(temp))
              return true;
              hm.put(temp,true);
              temp=temp.next;
        }
       return false; 
        
    }
}