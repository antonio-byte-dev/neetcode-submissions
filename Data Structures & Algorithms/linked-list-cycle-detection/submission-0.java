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
    public boolean calculateCycle(ListNode head,Set<ListNode> traversed)
    {
        if(head==null) return false;

        if(traversed.contains(head))
        {
            return true;
        }else{
            traversed.add(head);
            return calculateCycle(head.next,traversed);
        }
    }   
    public boolean hasCycle(ListNode head) {
        Set<ListNode> traversed = new HashSet<>();
        return calculateCycle(head,traversed);
    }
}
