// Last updated: 7/19/2026, 11:47:11 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                count++;
            }
            else
            end=intervals[i][1];
        
        }
        return count;
    }
}