// Last updated: 7/28/2026, 9:14:07 PM
1class Solution {
2    public String reverseWords(String s) {
3      String[] words=s.trim().split("\\s+");
4      String ans="";
5      for(int i=words.length-1;i>0;i--){
6        ans+=words[i]+" ";
7      }  
8      return ans+words[0];
9    }
10}