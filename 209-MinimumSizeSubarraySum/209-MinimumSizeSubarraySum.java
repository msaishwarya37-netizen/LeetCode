// Last updated: 7/21/2026, 8:38:37 PM
1class Solution {
2    public int longestMountain(int[] arr) {
3        int n=arr.length;
4        int[] up=new int[n];
5        int[] down=new int[n];
6        for(int i=1;i<arr.length;i++){
7        if(arr[i]>arr[i-1]){
8        up[i]=up[i-1]+1;
9    }
10        }
11    for(int i=n-2;i>=0;i--){
12    if(arr[i]>arr[i+1]){
13    down[i]=down[i+1]+1;
14}
15    }
16int ans=0;
17for(int i=0;i<arr.length;i++){
18if(up[i]>0 && down[i]>0){
19ans=Math.max(ans,up[i]+down[i]+1);
20}
21}
22return ans;
23}
24}