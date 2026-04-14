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
    public ListNode addNums(ListNode l1, ListNode l2, int carry)
    {
        ListNode head = new ListNode();
        if(l1==null&&l2==null){
            if(carry>0)return new ListNode(carry);
            else return null;
        }
        else if(l1==null)
        {
            head.val = (l2.val+carry);
        } 
        else if(l2==null) head.val = (l1.val+carry);
        else{
            head.val = l1.val+l2.val+carry;
        }
        carry= 0;
        if(head.val>=10)
        {
            carry = head.val/10;
            head.val -= carry*10; 
        }   
        else carry = 0;
        
       
        if(l1==null)
        {
            head.next = addNums(null,l2.next,carry);
        }else if(l2==null){
            head.next = addNums(l1.next,null,carry);
        }else{
            head.next=addNums(l1.next,l2.next,carry);
        }
        
       
        
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNums(l1,l2,0);
    }
}
