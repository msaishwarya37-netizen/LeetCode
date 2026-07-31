// Last updated: 7/31/2026, 1:59:20 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum=0;
        int n=cardPoints.length;
        for(int i=n-k;i<n;i++){           
            sum+=cardPoints[i];
        }
       int max=sum;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i]-cardPoints[n-k+i];
            max=Math.max(max,sum);
        }   
        return max;
    }
}