class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1;
        int high=num;
        while(low<high){
            int mid=(low+high)/2;
            if(mid==num/mid){
            if(num%mid==0){
                return true;
            }
        }
        if(mid<num/mid)
        low=mid+1;
        else
        high=mid-1;
    }
    return false;
    }
}