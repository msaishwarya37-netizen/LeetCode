// Last updated: 8/15/2026, 5:59:17 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4      
5        for(int i=0;i<k;i++){
6            sum+=nums[i];
7        }
8        int maxSum=sum;
9        for(int i=k;i<nums.length;i++){
10            sum+=nums[i];
11            sum-=nums[i-k];
12            maxSum=Math.max(maxSum,sum);
13        }
14        return (double)maxSum/k;
15    }
16}