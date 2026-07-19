// Last updated: 7/19/2026, 11:46:13 PM
class Solution {

    // Find row index of maximum element in a given column
    private int findMaxRow(int[][] mat, int col) {
        int maxRow=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>mat[maxRow][col]){
                maxRow=i;
            }
        }
        return maxRow;
    }
    public int[] findPeakGrid(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxRow=findMaxRow(mat,mid);
            int left=(mid-1>=0)?mat[maxRow][mid-1]:-1;
            int right=(mid+1<m)?mat[maxRow][mid+1]:-1;
            if(mat[maxRow][mid]>left && mat[maxRow][mid]>right){
                return new int[]{maxRow,mid};
            }
            else if(mat[maxRow][mid]<left){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,1};
    }
}