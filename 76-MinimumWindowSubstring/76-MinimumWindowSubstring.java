// Last updated: 7/29/2026, 6:05:20 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int[]freq=new int[128];
4      int left=0;
5      int max=0;
6      for(int right=0;right<s.length();right++){
7        
8        freq[s.charAt(right)]++;
9        while(freq[s.charAt(right)]>1){
10            freq[s.charAt(left)]--;
11            left++;
12        }
13        max=Math.max(max,right-left+1);
14      }  
15      return max;
16    }
17}