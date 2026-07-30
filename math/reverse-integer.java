class Solution {
    public int reverse(int x) {
        int rev=0;
        
        while(x!=0){
        int ldig=x%10;
        if(rev>Integer.MAX_VALUE||(rev>=Integer.MAX_VALUE&&ldig>7))
        return 0;
        if(rev<Integer.MIN_VALUE||(rev>=Integer.MAX_VALUE&&ldig<-8))
        return 0;
        rev=rev*10+ldig;
        x=x/10;
        }
        return rev;
            }
}