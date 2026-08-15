// Last updated: 8/15/2026, 10:16:14 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int row=0;
4        int col=grid[0].length-1;
5        int count=0;
6         while(row<grid.length && col>=0){
7         if(grid[row][col]<0){
8count+=grid.length-row;
9col--;
10         }
11else{
12row++;
13         }
14         }
15         return count;
16    }
17}