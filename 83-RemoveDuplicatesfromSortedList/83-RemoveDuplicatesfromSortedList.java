// Last updated: 8/24/2026, 8:03:16 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode small= new ListNode(0);
14        ListNode large=new ListNode(0);
15ListNode s=small,l=large;
16        while(head!=null){
17            if(head.val<x){
18                s.next=head;
19                s=s.next;
20            }
21            else{
22            l.next=head;
23            l=l.next;
24        }
25        head=head.next;
26        }
27        l.next=null;
28        s.next=large.next;
29return small.next;
30    }
31    
32
33}