// Last updated: 7/21/2026, 10:17:41 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        
4        int sum=0;
5        int n=cardPoints.length;
6        for(int i=n-k;i<n;i++){           
7            sum+=cardPoints[i];
8        }
9       int max=sum;
10        for(int i=0;i<k;i++){
11            sum=sum+cardPoints[i]-cardPoints[n-k+i];
12            max=Math.max(max,sum);
13        }   
14        return max;
15    }
16}