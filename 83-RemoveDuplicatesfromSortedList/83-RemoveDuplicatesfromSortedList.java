// Last updated: 8/24/2026, 7:35:51 PM
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
13        ListNode curr=head;
14        while(curr!=null && curr.next!=null){
15            if(curr.val==curr.next.val){
16                curr.next=curr.next.next;
17
18            }
19            else
20            curr=curr.next;
21        }
22        return head;
23    }
24}