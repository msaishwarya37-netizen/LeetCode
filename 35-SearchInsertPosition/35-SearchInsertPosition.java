// Last updated: 7/19/2026, 11:48:27 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid;
        while(low<=high){
           mid=(low+high)/2;
           if(nums[mid]==target)
           return mid;
           else if(nums[mid]>target)
           high=mid-1;
           else
           low=mid+1; 
        }
        return low;

    }
}