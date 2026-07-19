// Last updated: 7/19/2026, 11:46:57 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];

            int j = 0;
            while (nums2[j] != x) j++;

            int k = j + 1;
            int next = -1;
            while (k < nums2.length) {
                if (nums2[k] > x) {
                    next = nums2[k];
                    break;
                }
                k++;
            }

            ans[i] = next;
        }

        return ans;
    }
}
