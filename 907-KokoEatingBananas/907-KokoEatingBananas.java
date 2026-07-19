// Last updated: 7/19/2026, 11:46:34 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n=piles.length;
     int low=1;
    int high=0;
      
      for(int i=0;i<n;i++){
      high=Math.max(high,piles[i]);
      }
      int ans=high; 
      while(low<=high){
        int mid=(low+high)/2;
        if(can(piles,h,mid)){
        ans=mid;
        high=mid-1;
        }
        else{
        low=mid+1;
      }
      }
      return ans;
    }

private boolean can(int[] piles,int h,int k){
    long total=0;
    int n=piles.length;
    for(int i=0;i<n;i++){
          total+=(piles[i]+k-1)/k;
    }
    return total<=h;
}
}