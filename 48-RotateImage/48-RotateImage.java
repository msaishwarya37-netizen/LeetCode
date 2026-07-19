// Last updated: 7/19/2026, 11:48:26 PM
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
        }
        private void reverse(int[] row){
            int start=0;
            int end=row.length-1;
            while(start<=end){
                int temp1=row[start];
                row[start]=row[end];
                row[end]=temp1;
                start++;
                end--;
        
        }
    }
}