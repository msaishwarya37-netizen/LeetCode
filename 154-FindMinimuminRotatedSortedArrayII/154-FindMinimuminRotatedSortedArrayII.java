// Last updated: 8/16/2026, 11:49:27 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int low=0;
4        int high=nums.length-1;
5        while(low<high){
6            int mid=(low+high)/2;
7            if(nums[mid]>nums[high]){
8                low=mid+1;
9            }
10            else if(nums[mid]<nums[high])
11            high=mid;
12            else
13            high--;
14            
15        }
16        return nums[low];
17    }
18}