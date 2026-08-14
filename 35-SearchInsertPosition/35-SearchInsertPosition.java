// Last updated: 8/14/2026, 8:34:57 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3     int low=0;int high=nums.length-1;
4     while(low<=high){
5        int mid=(low+high)/2;
6        if(nums[mid]==target)
7        return mid;
8        if(nums[mid]<target)
9        low=mid+1;
10        else
11        high=mid-1;
12     }
13     return low;
14}
15}
16