// Last updated: 7/30/2026, 11:03:46 PM
1class Solution {
2    public int myAtoi(String s) {
3        int sign=1;
4        int result=0;
5        int i=0;
6        while(i<s.length()&&s.charAt(i)==' '){
7        i++;
8        }
9         if(i<s.length()&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
10            if(s.charAt(i)=='-'){
11            sign=-1;
12            }
13            i++;
14         }
15         while(i<s.length()&&Character.isDigit(s.charAt(i))){
16            int digit=s.charAt(i)-'0';
17         
18         if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 &&digit>7)){
19            if(sign==1)
20            return Integer.MAX_VALUE;
21            else
22            return Integer.MIN_VALUE;
23         }
24         result=result*10+digit;
25         i++;
26    }
27    return sign*result;
28}
29}
30
31