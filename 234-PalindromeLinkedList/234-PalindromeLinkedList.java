// Last updated: 8/26/2026, 8:03:14 PM
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
12    public void reorderList(ListNode head) {
13        ListNode slow=head,fast=head;
14        while(fast.next!=null && fast.next.next!=null){
15            slow=slow.next;
16            fast=fast.next.next;
17        }
18
19        ListNode prev=null,curr=slow.next;
20        slow.next=null;
21
22        while(curr!=null){
23            ListNode next=curr.next;
24            curr.next=prev;
25            prev=curr;
26            curr=next;
27        }
28        ListNode first=head;
29        ListNode second=prev;
30        while(second!=null){
31            ListNode next=first.next;
32            first.next=second;
33            second=second.next;
34            first.next.next=next;
35            first=next;
36        }
37    }
38}