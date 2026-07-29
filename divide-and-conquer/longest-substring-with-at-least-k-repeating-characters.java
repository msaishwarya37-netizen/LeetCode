
class Solution {
    public int longestSubstring(String s, int k) {
    if(s.length()<k)
        return 0;
    
    HashMap<Character,Integer> map=new HashMap<>();

    for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    for(int i=0;i<s.length();i++){
      if(map.get(s.charAt(i))<k){
        int left=longestSubstring(s.substring(0,i),k);
        int right=longestSubstring(s.substring(i+1),k);
        return Math.max(left,right);
      }      

    }
    return s.length();
     
    }
}