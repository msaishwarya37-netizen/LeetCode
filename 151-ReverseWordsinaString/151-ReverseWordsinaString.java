// Last updated: 7/28/2026, 10:12:59 PM
1class Solution {
2    public String reverseWords(String s) {
3      String[] words=s.trim().split("\\s+");
4      String ans=words[words.length-1];
5      for(int i=words.length-2;i>=0;i--){
6        ans+=" "+words[i];
7      }  
8      return ans;
9    }
10}