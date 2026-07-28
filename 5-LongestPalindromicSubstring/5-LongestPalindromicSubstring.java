// Last updated: 7/28/2026, 10:44:59 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        String ans="";
4        for(int i=0;i<s.length();i++){
5            for(int j=i;j<s.length();j++){
6                String sub=s.substring(i,j+1);
7                if(isPalindrom(sub) && sub.length()>ans.length()){
8                    ans=sub;
9                }
10            }
11        }
12        return ans;
13    }
14  public boolean isPalindrom(String str){
15    int left=0;
16    int right=str.length()-1;
17    while(left<right){
18        if(str.charAt(left)!=str.charAt(right)){
19            return false;
20        }
21        left++;
22        right--;
23    }
24  
25  return true;
26  }
27}