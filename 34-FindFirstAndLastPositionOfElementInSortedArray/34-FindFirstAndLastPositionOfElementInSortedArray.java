// Last updated: 7/19/2026, 11:48:30 PM
class Solution {
    public int first(int[] nums,int target){
        int low=0,high=nums.length-1;
        int mid=0;
        int first=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
            first=mid;
            high=mid-1;
            }
            else if(nums[mid]<target){
            low=mid+1;
            }
            else{
            high=mid-1;
        }
        }
        return first;
    }
    public int last(int[] nums,int target){
        int low=0,high=nums.length-1;
        int mid=0;
        int last=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
            last=mid;
            low=low+1;
            }
            else if(nums[mid]<target){
            low=mid+1;
            }
            else{
            high=mid-1;
            } 
        }
            return last;   
    }
    public int[] searchRange(int[] nums, int target) {
        int firstpos=first(nums,target);
        int lastpos=last(nums,target);
        return new int[]{firstpos,lastpos};
    }
}