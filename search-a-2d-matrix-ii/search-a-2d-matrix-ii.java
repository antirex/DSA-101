class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length - 1;
        int rows = 0;
        while(cols>=0 && rows<matrix.length){
            if(matrix[rows][cols] == target) return true;
            else if(target<matrix[rows][cols]) cols--;
            else rows++;
        }
        return false;
    }
}