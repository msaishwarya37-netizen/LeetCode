// Last updated: 7/21/2026, 8:01:36 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int len=Integer.MAX_VALUE;
4        
5        int i=0;
6            int sum=0;
7            for(int j=0;j<nums.length;j++){
8                sum+=nums[j];
9                while(sum>=target){
10                len=Math.min(len,j-i+1);
11                sum-=nums[i];
12                i++;
13                }
14            }
15            
16        
17        return len==Integer.MAX_VALUE?0:len;
18    }
19}