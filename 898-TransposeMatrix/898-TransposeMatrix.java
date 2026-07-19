// Last updated: 7/19/2026, 11:46:35 PM
class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] trans=new int[cols][rows];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                trans[j][i]=matrix[i][j];
            }
        }

        return trans;
    }
}
