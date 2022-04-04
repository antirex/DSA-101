class Solution {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(mat[i][j]);
            }
        }
        for(int i =0;i<k-1;i++) pq.remove();
        return pq.peek();
    }
}