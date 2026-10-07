class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rowi = 0;
        int maxc = 0;

        for(int i=0;i<mat.length;i++){
            int curc = 0;
            for(int j=0; j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    curc++;
                }
            }
            if(curc > maxc){
                maxc = curc;
                rowi = i;
            }
        }
        return new int[]{rowi,maxc};
    }
}