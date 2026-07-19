// Last updated: 7/19/2026, 11:46:19 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
        }
        int ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(can(nums,threshold,mid)){
            ans=mid;
            high=mid-1;}
            else{
            low=mid+1;
            }

        }
        return ans;
    }
    private boolean can(int[] nums,int threshold,int d){
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]+d-1)/d;
        }
        return sum<=threshold;
    }
}