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
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        
        ListNode prev=null;
        ListNode current = head;
        int length = 1;
        while(current.next!=null)
        {
            current=current.next;
            length++;
        }
        current = head;
        length-=(n);
        n=length;
        while(current.next!=null&&i<n)
        {
            
                prev = current;
                current = current.next;
                i++;
        }

        if(prev==null)
        {
            if(current==null) return null;
            else{
                return current.next;
            } 
        } 

            prev.next = current.next;
            current.next=null;
            return head;
        }
       
    }

