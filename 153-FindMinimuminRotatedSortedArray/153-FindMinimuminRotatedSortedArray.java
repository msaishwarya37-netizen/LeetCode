// Last updated: 8/14/2026, 11:21:11 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3       int low=0;
4       int high=letters.length-1;
5       while(low<=high){
6        int mid=(low+high)/2;
7        if(letters[mid]<=target){
8            low=mid+1;
9        }
10        else{
11            high=mid-1;
12        }
13       }
14       return letters[low%letters.length];
15
16       }    
17}