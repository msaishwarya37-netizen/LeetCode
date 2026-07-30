// Last updated: 7/30/2026, 10:12:31 PM
1class Solution {
2    public int reverse(int x) {
3        int rev=0;
4        
5        while(x!=0){
6        int ldig=x%10;
7        if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&ldig>7))
8        return 0;
9        if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&ldig<-8))
10        return 0;
11        rev=rev*10+ldig;
12        x=x/10;
13        }
14        return rev;
15            }
16}