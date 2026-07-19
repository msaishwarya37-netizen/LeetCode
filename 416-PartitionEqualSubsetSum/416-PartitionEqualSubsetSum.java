// Last updated: 7/19/2026, 11:47:14 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int target=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      } 
      if(sum%2!=0)
      return false;
      target=sum/2;
      boolean [] dp=new boolean[target+1];
      dp[0]=true;
      for(int i=0;i<nums.length;i++){
        for(int j=target;j>=nums[i];j--){
            dp[j]=dp[j]||dp[j-nums[i]];
        }

      }
      return dp[target];
}
}