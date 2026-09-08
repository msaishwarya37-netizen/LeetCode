// Last updated: 9/8/2026, 11:55:00 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3    int [] ans=new int[nums1.length];
4    for(int i=0;i<nums1.length;i++){
5        int j=0;
6        while(nums2[j]!=nums1[i])
7        j++;
8        while(j<nums2.length &&nums2[j]<=nums1[i])
9        j++;
10        if(j==nums2.length)
11        ans[i]=-1;
12        else
13        ans[i]=nums2[j];
14    }
15    return ans;
16    }
17    }
18