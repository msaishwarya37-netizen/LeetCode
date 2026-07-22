// Last updated: 7/22/2026, 8:32:49 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1)
4        return 0;
5        int left=0;
6        int product=1;
7        int count=0;
8        for(int right=0;right<nums.length;right++){
9         product*=nums[right];
10         while(product>=k){
11            product/=nums[left];
12            left++;
13         }
14         count+=right-left+1;
15        }
16        return count;
17    }
18}