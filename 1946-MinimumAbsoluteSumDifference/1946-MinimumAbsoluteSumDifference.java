// Last updated: 7/19/2026, 11:46:04 PM
class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int mod=1000000007;
        int [] sorted=nums1.clone();
        java.util.Arrays.sort(sorted);
         long sum=0;
         long maxGain=0;
        for (int i=0;i<n;i++){
            int current=Math.abs(nums1[i]-nums2[i]);
            sum+=current;
            int left=0;
            int right=n-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(sorted[mid]<nums2[i])
                left=mid+1;
                else
                right=mid-1;}
            if(left<n){
                maxGain=Math.max(maxGain,current-Math.abs(sorted[left]-nums2[i]));}
            if(left>0) {
                maxGain=Math.max(maxGain,current-Math.abs(sorted[left-1]-nums2[i]));}}
        return (int)((sum-maxGain)%mod);
    }
}