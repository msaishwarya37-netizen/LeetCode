// Last updated: 8/17/2026, 10:25:13 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0)
4        return false;
5        int og=x;
6        int rev=0;
7        while(x>0){
8            int digit=x%10;
9            rev=rev*10+digit;
10            x=x/10;
11        }
12        return og==rev;
13    }
14}