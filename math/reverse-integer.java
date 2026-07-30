class Solution {
    public int reverse(int x) {
        int rev=0;
        
        while(x!=0){
        int ldig=x%10;
        rev=rev*10+ldig;
        x=x/10;
        }
        return rev;
            }
}