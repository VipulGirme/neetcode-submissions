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
    public Node copyRandomList(Node head) {
        if(head ==  null) {
            return null;
        }
        HashMap<Node, Node> oldNew =  new HashMap<>();
        Node curr = head;
        while (curr!= null) {
            oldNew.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        curr = head;

        while (curr!= null) {
            oldNew.get(curr).next = oldNew.get(curr.next);
            oldNew.get(curr).random = oldNew.get(curr.random);
            curr = curr.next;
        }
        return oldNew.get(head);
    }
}
