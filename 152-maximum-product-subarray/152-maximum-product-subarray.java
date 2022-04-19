class Solution {
    public int maxProduct(int[] arr) {
        int max = arr[0];
        int res = max;
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            int dummy = max;
            max = Math.max(arr[i] , Math.max(max * arr[i], min*arr[i]));
            min = Math.min(arr[i], Math.min(dummy * arr[i], min*arr[i]));
            res = Math.max(max,res);
        }
        return res;
    }
}