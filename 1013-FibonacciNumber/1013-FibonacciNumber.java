// Last updated: 7/19/2026, 11:46:30 PM
class Solution {
    public int fib(int n) {
      if(n<=1)
          return n;
       return fib(n-1)+fib(n-2);
    }
}