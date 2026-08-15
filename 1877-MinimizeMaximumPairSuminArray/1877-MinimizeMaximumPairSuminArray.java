// Last updated: 8/15/2026, 8:31:26 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first=find(nums,target,1);
4        int last=find(nums,target,2);
5        return new int[]{first,last};
6    }
7        int find(int[] nums,int target,int type){
8        int low=0;int high=nums.length-1;
9        int ans=-1;
10        while(low<=high){
11            int mid=(low+high)/2;
12            if(nums[mid]==target){
13                ans=mid;
14            if(type==1)
15                high=mid-1;
16            else
17                low=mid+1;
18            }
19            else if(nums[mid]<target)
20                low=mid+1;
21            else
22            high=mid-1;
23        }
24        return ans;
25    }
26}