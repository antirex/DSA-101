class Solution {
    public void rotate(int[][] mat) {
        for(int i =0;i<mat.length;i++){
            for(int j = i+1;j<mat[0].length;j++){
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }
        for(int i = 0; i < mat.length; i++) {
        int low = 0, high = mat[0].length - 1;
            while (low < high) {
                int t = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = t;
                low++;
                high--;
            }
        }
    }
}