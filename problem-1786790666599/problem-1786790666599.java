// Last updated: 8/15/2026, 4:14:26 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n=matrix.length;
4       int low=matrix[0][0];
5       int high=matrix[n-1][n-1];
6       while(low<high){
7        int mid=low+(high-low)/2;
8        int count=0;
9        int row=n-1;
10        int col=0;
11        while(row>=0 && col<n){
12        if(matrix[row][col]<=mid){
13            count+=row+1;
14            col++;
15        }
16        else
17        {
18            row--;
19        }
20        }
21if(count<k)
22low=mid+1;
23else
24high=mid;
25       }
26       
27        return low;
28       
29    }
30}