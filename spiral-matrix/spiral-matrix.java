class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;
        while(rowEnd >= rowStart && colEnd >= colStart){
            //right
            for(int i = colStart; i<=colEnd; i++){
                list.add(matrix[rowStart][i]);
            }
            rowStart++;
            if(rowEnd < rowStart || colEnd < colStart){
                break;
            }
            //down
            for(int i = rowStart; i<=rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowEnd < rowStart || colEnd < colStart){
                break;
            }
           
                //Left
                for (int i = colEnd; i >= colStart; i--) {
                    list.add(matrix[rowEnd][i]);
                }
           
            rowEnd--;
            if(rowEnd < rowStart || colEnd < colStart){
                break;
            }
                //Up
                for (int i = rowEnd; i >= rowStart;i--) {
                    list.add(matrix[i][colStart]);
                }
          
            colStart ++;
            if(rowEnd < rowStart || colEnd < colStart){
                break;
            }
        }
        
        return list;
    }
}