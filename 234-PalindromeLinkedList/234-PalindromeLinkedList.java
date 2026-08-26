// Last updated: 8/26/2026, 1:48:52 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy=new ListNode(0);
14        dummy.next=head;
15        ListNode prev=dummy;
16        ListNode curr=head;
17        while(curr!=null && curr.next!=null){
18            
19            if(curr.val==curr.next.val){
20                int x=curr.val;
21                while(curr!=null && curr.val==x)
22                    curr=curr.next;
23                    prev.next=curr;
24                }
25                else{
26                prev=curr;
27                curr=curr.next;
28            }
29        }
30        return dummy.next;
31    }
32}