class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=find(nums,target,1);
        int last=find(nums,target,2);
        return new int[]{first,last};
    }
        int find(int[] nums,int target,int type){
        int low=0;int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
            if(type==1)
                high=mid-1;
            else
                low=mid+1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
            high=mid-1;
        }
        return ans;
    }
}