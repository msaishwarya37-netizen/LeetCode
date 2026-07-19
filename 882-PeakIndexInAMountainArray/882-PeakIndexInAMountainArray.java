// Last updated: 7/19/2026, 11:46:37 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int left = 0, right = arr.length - 1;
       while(left<right){
       int mid=(left+right)/2;
        if(arr[mid]<arr[mid+1]){
            left=mid+1;
       }
       else{
        right=mid;
       }
       }
       return left;
    }
}