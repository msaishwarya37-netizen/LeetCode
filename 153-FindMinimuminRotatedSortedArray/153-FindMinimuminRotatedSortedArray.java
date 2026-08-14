// Last updated: 8/14/2026, 11:35:15 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int low=1;
4        int high=num;
5        while(low<=high){
6            int mid=(low+high)/2;
7            if(mid==num/mid){
8            if(num%mid==0){
9                return true;
10            }
11        }
12        if(mid<num/mid)
13        low=mid+1;
14        else
15        high=mid-1;
16    }
17    return false;
18    }
19}