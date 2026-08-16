// Last updated: 8/16/2026, 12:12:10 PM
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] prime=new boolean[n];
4        for(int i=2;i<n;i++)
5            prime[i]=true;
6            int count=0;
7        for(int i=2;i<n;i++){
8            if(prime[i]){
9                count++;
10            for(int j=i*2;j<n;j+=i)
11                prime[j]=false;
12            }
13        }
14        return count;
15            
16        
17    }
18}