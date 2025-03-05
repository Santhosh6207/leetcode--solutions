/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        ListNode temp=head;
        while(temp!=null)
        {
            tm.put(temp.val,tm.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0);  
        ListNode res = dummy;  
        
        for(Map.Entry<Integer,Integer>entry:tm.entrySet())
        {
            int c=entry.getKey();
            int val=entry.getValue();
            if(val<2)
            {
                res.next = new ListNode(c);  
                res = res.next;      
            }
        }
        return dummy.next;
    }
}