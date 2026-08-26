// Last updated: 8/26/2026, 12:33:34 PM
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        if(head==null||head.next==null)
4        return true;
5
6        ListNode slow=head,fast=head;
7
8        while(fast!=null && fast.next!=null){
9            slow=slow.next;
10            fast=fast.next.next;
11        }
12        ListNode prev=null;
13        while(slow!=null){
14            ListNode next=slow.next;
15            slow.next=prev;
16            prev=slow;
17            slow=next;
18        }
19
20        while(prev!=null){
21            if(head.val!=prev.val)
22            return false;
23            head=head.next;
24            prev=prev.next;
25        }
26        return true;                                                           
27    }
28}