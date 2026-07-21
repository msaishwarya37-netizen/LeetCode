class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum=0;
        int n=cardPoints.length;
        for(int i=n-k;i<n;i++){
           
            sum+=cardPoints[i];
        }
       int max=sum;
        for(int i=0;i<n;i++){
            sum+=cardPoints[i]-cardPoints[n-k];
            max=Math.max(max,sum);
        }   
        return max;
    }
}