// Last updated: 8/15/2026, 7:40:06 PM
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int low=0;
5        int high=nums.length-1;
6        int maxSum=0;
7        while(low<high){
8            int sum=nums[low]+nums[high];
9            maxSum=Math.max(maxSum,sum);
10            low++;
11            high--;
12        }
13        return maxSum;
14    }
15}