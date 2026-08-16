// Last updated: 8/16/2026, 12:32:07 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int count=0;
         while(row<grid.length && col>=0){
         if(grid[row][col]<0){
count+=grid.length-row;
col--;
         }
else{
row++;
         }
         }
         return count;
    }
}