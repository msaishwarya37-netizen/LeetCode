// Last updated: 7/19/2026, 11:47:41 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k > n

        // Step 1: reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
