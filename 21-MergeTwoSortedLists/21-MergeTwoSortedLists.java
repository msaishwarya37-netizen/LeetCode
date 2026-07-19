// Last updated: 7/19/2026, 11:48:35 PM
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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;

        ListNode head;

        if (a.val < b.val) {
            head = a;
            head.next = mergeTwoLists(a.next, b);
        } else {
            head = b;
            head.next = mergeTwoLists(a, b.next);
        }

        return head;
    
    }
}