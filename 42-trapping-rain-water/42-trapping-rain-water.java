class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int res = 0;
        int[] left = maxLeft(arr);
        int[] right = maxRight(arr);
        for(int i =1;i<n-1; i++){
            ans[i] = Math.min(left[i], right[i]) - arr[i];
            res = res + ans[i];
        }
        return res;
    }
    public static int[] maxLeft(int arr[]){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for(int i=1;i<arr.length;i++) res[i] = Math.max(res[i-1],arr[i]);
        return res;
    }
    public static int[] maxRight(int arr[]){
        int[] res = new int[arr.length];
        res[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) res[i] = Math.max(res[i+1],arr[i]);
        return res;
    }
}