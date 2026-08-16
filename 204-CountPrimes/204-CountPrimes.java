// Last updated: 8/16/2026, 12:33:55 PM
class Solution {
    public int countPrimes(int n) {
        boolean[] prime=new boolean[n];
        for(int i=2;i<n;i++)
            prime[i]=true;
            int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                count++;
            for(int j=i*2;j<n;j+=i)
                prime[j]=false;
            }
        }
        return count;
            
        
    }
}