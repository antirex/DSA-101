class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0; 
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == 0) count = 0;
            else count++;
            res = Math.max(res, count);
        }
        return res;
    }
}