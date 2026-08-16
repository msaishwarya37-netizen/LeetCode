// Last updated: 8/16/2026, 12:34:16 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[mid+1])
            low=mid+1;
            else
            high=mid;
        }
        return low;
    }
}