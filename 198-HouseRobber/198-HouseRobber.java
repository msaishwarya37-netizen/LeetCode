// Last updated: 7/19/2026, 11:47:38 PM
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
    
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);

    for(int i=2;i<n;i++){
        int current=Math.max(second,first+nums[i]);
        first=second;
        second=current;
    }
        return second;
    }
}