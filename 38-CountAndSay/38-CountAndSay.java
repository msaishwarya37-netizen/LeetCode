// Last updated: 8/16/2026, 12:34:49 PM
class Solution {
    public String countAndSay(int n) {
       String ans="1"; 
       for(int i=2;i<=n;i++){
         int count=1;
        String temp="";
        for(int j=1;j<=ans.length();j++){
            if(j<ans.length()&& ans.charAt(j)==ans.charAt(j-1)){
                count++;
            }
            else
            {
                temp=temp+count+ans.charAt(j-1);
                count=1;
            }
        }
        ans=temp;
       }
       return ans;
    }
}