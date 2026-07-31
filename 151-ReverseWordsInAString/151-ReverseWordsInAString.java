// Last updated: 7/31/2026, 2:02:12 PM
class Solution {
    public String reverseWords(String s) {
      String[] words=s.trim().split("\\s+");
      String ans=words[words.length-1];
      for(int i=words.length-2;i>=0;i--){
        ans+=" "+words[i];
      }  
      return ans;
    }
}