// Last updated: 7/29/2026, 11:57:21 PM
1class Solution {
2    public int firstUniqChar(String s) {
3      int[]count=new int[26];
4      for(int i=0;i<s.length();i++){
5        count[s.charAt(i)-'a']++;
6      }
7        for(int i=0;i<s.length();i++){
8            if(count[s.charAt(i)-'a']==1){
9            return i;
10        }
11      }  
12      return -1;
13    }
14}