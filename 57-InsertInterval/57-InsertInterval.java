// Last updated: 7/21/2026, 1:01:04 AM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]>ans=new ArrayList<>();
4        for(int i=0;i<intervals.length;i++){
5        if(intervals[i][1]<newInterval[0]){
6            ans.add(intervals[i]);
7        }
8        else if(intervals[i][0]>newInterval[1]){
9            ans.add(newInterval);
10            newInterval=intervals[i];
11        }
12        else
13        newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
14        newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
15    }
16
17ans.add(newInterval);
18return ans.toArray(new int[0][]);
19}
20}