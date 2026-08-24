// Last updated: 8/24/2026, 8:16:34 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        if(head==null||head.next==null)
14        return head;
15        ListNode temp=head.next;
16        head.next=swapPairs(temp.next);
17        temp.next=head;
18        return temp;
19    }
20
21}