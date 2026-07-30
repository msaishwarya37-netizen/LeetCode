import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String,List<String>>map=new HashMap<>();
      for(int i=0;i<strs.length;i++){
        int[] count=new int[26];
        for(int j=0;j<strs[i].length();j++){
            count[strs[i].charAt(j)-'a']++;
        }
            String key="";
            for( int k=0;k<count.length;k++){
                key+="#"+count[k];
            }
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
      }
    }