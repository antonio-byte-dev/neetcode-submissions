/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copy(Node head, Map<Node,Node> val)
    {
        if(head==null)return null;
        Node head_cpy = new Node(head.val);
        val.put(head,head_cpy);
        head_cpy.next = copy(head.next,val);
        if(head.random==null)
        {
            head_cpy.random=null;
        }else{
            
            head_cpy.random = val.get(head.random);
        }
        
        return head_cpy;
    }
    public Node copyRandomList(Node head) {
        return copy(head,new HashMap<Node,Node>());
    }
}
