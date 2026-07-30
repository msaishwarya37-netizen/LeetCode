// Last updated: 7/30/2026, 5:30:54 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6     int[] count=new int[26];
7
8     for(int i=0;i<s.length();i++){
9        count[s.charAt(i)-'a']++;
10        count[t.charAt(i)-'a']--;
11        
12     }   
13     for(int i=0;i<count.length;i++){
14        if(count[i]!=0)
15            return false;
16        
17     }
18     return true;
19    }
20}