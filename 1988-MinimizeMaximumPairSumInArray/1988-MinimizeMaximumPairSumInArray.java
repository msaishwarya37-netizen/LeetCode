// Last updated: 8/16/2026, 12:31:57 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int maxSum=0;
        while(low<high){
            int sum=nums[low]+nums[high];
            maxSum=Math.max(maxSum,sum);
            low++;
            high--;
        }
        return maxSum;
    }
}