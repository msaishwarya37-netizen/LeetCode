// Last updated: 8/16/2026, 12:31:35 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int low=0;
4        int high=nums.length-1;
5        while(low<high){
6            int mid=(low+high)/2;
7            if(nums[mid]<nums[mid+1])
8            low=mid+1;
9            else
10            high=mid;
11        }
12        return low;
13    }
14}