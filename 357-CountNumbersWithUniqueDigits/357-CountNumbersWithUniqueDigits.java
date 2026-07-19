// Last updated: 7/19/2026, 11:47:16 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        return 1;

        int ans=10;
        int unique=9;
        int available=9;

        while(n>1 && available>0){
            unique=unique*available;
            ans+=unique;
            available--;
            n--;
        }
return ans;
    }
}