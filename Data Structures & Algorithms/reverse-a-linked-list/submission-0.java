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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode curr = head;
        ListNode res = null;

        while(curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = res;
            res = curr;
            curr = nextTemp;
        }
        return res;
    }
}
