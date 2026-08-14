// Last updated: 8/14/2026, 10:49:59 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int low = 0, high = nums.length - 1;
4        while(low<high){
5            int mid=(low+high)/2;
6            if(nums[mid]>nums[high]){
7                low=mid+1;
8            }
9             else{
10             high=mid;   
11        }
12        }
13        return nums[low];
14    }
15}
16
17
18
19
20
21
22
23
24
25        