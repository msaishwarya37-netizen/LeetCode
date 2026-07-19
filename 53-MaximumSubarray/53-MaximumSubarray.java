// Last updated: 7/19/2026, 11:48:24 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        
        if(sum>max)
        max=sum;
        if(sum<0)
        sum=0;
        }
        return max;
      
    }
}