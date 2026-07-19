// Last updated: 7/19/2026, 11:46:06 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int maxi=0;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            System.out.println(sum+" ");
            maxi=Math.max(maxi,sum);
            System.out.println(maxi+" ");
        }
        return maxi;
    }
}