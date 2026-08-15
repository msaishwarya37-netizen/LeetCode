// Last updated: 8/15/2026, 5:35:47 PM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low=0;
4        int high=0;
5        for(int i=0;i<weights.length;i++){
6        low=Math.max(low,weights[i]);
7        high+=weights[i];
8        }
9        while(low<=high){
10            int mid=(low+high)/2;
11            int sum=0;
12            int d=1;
13            for(int i=0;i<weights.length;i++){
14                if(sum+weights[i]>mid){
15                    d++;
16                    sum=0;
17                }
18                    sum+=weights[i];
19                
20            }
21            if(d<=days)
22            high=mid-1;
23            else
24            low=mid+1;
25        }
26        return low;
27    }
28}