// Last updated: 8/14/2026, 11:03:05 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3       int low=0;int high=arr.length-1;
4       while(low<high){
5        int mid=(low+high)/2;
6        if(arr[mid]<arr[mid+1]){
7            low=mid+1;
8        }
9        else{
10        high=mid;
11       }
12       }
13       return low;
14    }
15}
16