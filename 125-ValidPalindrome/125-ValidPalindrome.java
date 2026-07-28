// Last updated: 7/28/2026, 8:06:25 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left=0;
4        int right=s.length()-1;
5        while(left<right){
6            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
7            {
8                left++;
9            }
10        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
11            right--;
12        }
13        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
14            return false;
15        }
16        left++;
17        right--;
18        }
19        return true;
20    }
21}