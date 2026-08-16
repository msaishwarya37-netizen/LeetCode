// Last updated: 8/16/2026, 1:05:41 PM
1
2class Solution {
3    public int findInMountainArray(int target, MountainArray mountainArr) {
4        int low=0;
5        int high=mountainArr.length()-1;
6        while(low<high){
7            int mid=(low+high)/2;
8            if(mountainArr.get(mid)<mountainArr.get(mid+1))
9                low=mid+1;
10            else 
11            high=mid;
12    }
13    int peak=low;
14    low=0;
15    high=peak;
16    while(low<=high){
17         int mid=(low+high)/2;
18        if(mountainArr.get(mid)==target)
19        return mid;
20        if(mountainArr.get(mid)<target)
21        low=mid+1;
22        else
23        high=mid-1;
24    }
25    low=peak+1;
26    high=mountainArr.length()-1;
27     while(low<=high){
28         int mid=(low+high)/2;
29        if(mountainArr.get(mid)==target)
30        return mid;
31        if(mountainArr.get(mid)>target)
32        low=mid+1;
33        else
34        high=mid-1;
35    }
36    return -1; 
37}
38}