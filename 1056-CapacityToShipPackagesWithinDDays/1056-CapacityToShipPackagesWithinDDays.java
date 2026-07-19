// Last updated: 7/19/2026, 11:46:26 PM
class Solution {
    // This is the findDays function from your image
    public int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
        
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + load > cap) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    // This is the leastWeightCapacity function from your image
    public int shipWithinDays(int[] weights, int d) {
        int low = 0; //maximum from array
        int high = 0; //sum
        
        // Find max element and sum (equivalent to max_element and accumulate)
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];
            }
            high += weights[i];
        }
        
        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            
            if (numberOfDays <= d) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        // Returning low gives the minimum capacity that works
        return low;
    }
}