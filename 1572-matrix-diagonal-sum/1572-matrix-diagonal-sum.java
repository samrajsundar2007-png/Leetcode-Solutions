class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int row =mat.length;
        for(int i=0;i<row;i++){
            if(i==row-1-i){
                sum += mat[i][i];
            }
            else{
                sum += mat[i][i];
                sum += mat[i][row-1-i];
            }
        }
        return sum;

    }
}