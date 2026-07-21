class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=1;
        int sum=0;
        int n=cardPoints.length;
        for(int i=n-k;i<n;i++){
           
            sum+=cardPoints[i];
        }
       return sum;
        
    }
}