// Last updated: 8/17/2026, 10:03:08 PM
1
2public class Solution {
3    public ListNode detectCycle(ListNode head) {
4        ListNode slow=head;
5        ListNode fast=head;
6         while(fast!=null && fast.next!=null){
7            slow=slow.next;
8            fast=fast.next.next;
9        if(slow==fast){
10            slow=head;
11        while(slow!=fast){
12            slow=slow.next;
13            fast=fast.next;
14        }
15        return slow;
16    }
17}
18return null;
19    }
20}