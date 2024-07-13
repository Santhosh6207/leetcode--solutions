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
    public ListNode detectCycle(ListNode head) {
         HashMap<ListNode,Boolean>hm=new HashMap<>();
        ListNode temp=head;
        while(temp!=null&&temp.next!=null)
        {
            if(hm.containsKey(temp))
              return temp;
              hm.put(temp,true);
              temp=temp.next;
        }
       return null; 
        
    }
}