// Last updated: 7/30/2026, 6:40:44 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5
6      HashMap<String,List<String>>map=new HashMap<>();
7      for(int i=0;i<strs.length;i++){
8        int[] count=new int[26];
9        for(int j=0;j<strs[i].length();j++){
10            count[strs[i].charAt(j)-'a']++;
11        }
12            String key="";
13            for( int k=0;k<count.length;k++){
14                key+="#"+count[k];
15            }
16            if(!map.containsKey(key)){
17                map.put(key,new ArrayList<>());
18            }
19            map.get(key).add(strs[i]);
20        }
21        return new ArrayList<>(map.values());
22      }
23    }