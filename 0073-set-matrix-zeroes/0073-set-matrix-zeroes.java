class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rowZero[] = new boolean[n];
        boolean colZero[] = new boolean[m];
        for(int i = 0 ;i<n;i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                if(rowZero[i] == true || colZero[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}