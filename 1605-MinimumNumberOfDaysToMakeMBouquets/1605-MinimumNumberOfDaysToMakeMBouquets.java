// Last updated: 7/19/2026, 11:47:01 PM
class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // If not enough flowers
        if ((long)m * k > n) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find min & max
        for (int i = 0; i < n; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        int ans = high;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean possible(int[] arr, int day, int m, int k) {

        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= day) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }

        // last segment
        bouquets += count / k;

        return bouquets >= m;
    }
}