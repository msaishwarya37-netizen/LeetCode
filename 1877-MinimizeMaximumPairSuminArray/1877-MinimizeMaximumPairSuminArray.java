// Last updated: 8/15/2026, 10:38:46 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row=0;
4        int col=matrix[0].length-1;
5        while(row<matrix.length && col>=0){
6            if(matrix[row][col]==target)
7            return true;
8            if(matrix[row][col]>target)
9            col--;
10            else
11            row++;
12        }
13        return false;
14    }
15}