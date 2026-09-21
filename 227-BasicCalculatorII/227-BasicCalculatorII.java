// Last updated: 9/21/2026, 11:09:20 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3      Deque<Integer>dq=new ArrayDeque<>();
4      int j=0;
5      int[]ans=new int[nums.length-k+1];
6      for(int i=0;i<nums.length;i++){
7        if(!dq.isEmpty()&& dq.peekFirst()<=i-k)
8            dq.pollFirst();
9        while(!dq.isEmpty()&& nums[dq.peekLast()]<=nums[i])
10        dq.pollLast();
11        dq.addLast(i);
12        if(i>=k-1)
13        ans[j++]=nums[dq.peekFirst()];
14
15      }
16      return ans;
17      }  
18    }
19