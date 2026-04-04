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

//Split list into two
//Reverse one half
//merge two halves
class Solution {
    public ListNode reverse(ListNode head)
    {
        if(head==null)return null;
        if(head.next==null) return head;

        ListNode res = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
    public ListNode mergeLists(ListNode l1,ListNode l2,int i)
    {
        if(l1==null) return l2;
        if(l2==null) return l1;

        
        if(i%2==0)
        {
            i++;
            l1.next = mergeLists(l1.next,l2,i);
            return l1;
        }else{
            i++;
            l2.next = mergeLists(l1,l2.next,i);
            return l2;
        }
       
    }
    public void reorderList(ListNode head) {
        //First we divide into two lists
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null)
        {            
            fast = fast.next;
            if(fast.next==null)break;
            fast=fast.next;
            slow = slow.next;
        }
        ListNode reversed = reverse(slow.next);
        slow.next = null;
        
        head = mergeLists(head,reversed,0);
    }
}
