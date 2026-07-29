// Last updated: 7/29/2026, 6:19:07 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4      int left=0;
5      int max=0;
6      HashMap<Character,Integer>map=new HashMap<>();
7      for(int right=0;right<s.length();right++){
8        if(map.containsKey(s.charAt(right))){
9            left=Math.max(left,map.get(s.charAt(right))+1);
10        }
11        map.put(s.charAt(right),right);
12      
13      max=Math.max(max,right-left+1);
14      }
15      return max;
16    }
17}