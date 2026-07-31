// Last updated: 7/31/2026, 2:58:41 PM
1class Solution {
2    public String countAndSay(int n) {
3       String ans="1"; 
4       for(int i=2;i<=n;i++){
5         int count=1;
6        String temp="";
7        for(int j=1;j<=ans.length();j++){
8            if(j<ans.length()&& ans.charAt(j)==ans.charAt(j-1)){
9                count++;
10            }
11            else
12            {
13                temp=temp+count+ans.charAt(j-1);
14                count=1;
15            }
16        }
17        ans=temp;
18       }
19       return ans;
20    }
21}