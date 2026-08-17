// Last updated: 8/17/2026, 8:23:44 PM
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
12    public ListNode oddEvenList(ListNode head) {
13        if (head == null || head.next == null) 
14            return head;
15        
16        ListNode odd = head;
17        ListNode even = head.next;
18ListNode evenhead=even;
19        while (even != null && even.next != null) {
20            odd.next = even.next;
21            odd = odd.next;
22
23            even.next = odd.next;
24            even = even.next;
25
26        }
27odd.next=evenhead;
28        return head;
29    }
30}