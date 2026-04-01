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
    private ListNode traverseList(ListNode prev, ListNode head)
    {
        if(head==null&&prev==null) return null;
        if(head==null&&prev!=null) return prev;
        if(prev==null)
        {
            ListNode next = head.next;
            head.next = null;
            return traverseList(head,next);
        }else{
            ListNode next = head.next;
            head.next = prev;
            return traverseList(head,next);
        }
    }
    public ListNode reverseList(ListNode head) {
        return traverseList(null,head);
    }
}
