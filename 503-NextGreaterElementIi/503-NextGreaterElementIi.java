// Last updated: 7/19/2026, 11:46:55 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int x = nums[i];
            int next = -1;

            // Search the next n-1 elements circularly
            int k = (i + 1) % n;

            while (k != i) {
                if (nums[k] > x) {
                    next = nums[k];
                    break;
                }
                k = (k + 1) % n; // Move circularly
            }

            ans[i] = next;
        }

        return ans;
    }
}
