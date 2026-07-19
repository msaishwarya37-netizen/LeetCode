// Last updated: 7/19/2026, 11:48:03 PM
class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp1=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp1;
                high--;
            }
        }
    }
}