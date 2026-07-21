// Last updated: 7/21/2026, 8:23:17 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
            return nums;
        }
    }
