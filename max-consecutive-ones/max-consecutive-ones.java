class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0, res = 0; 
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0) count = 0;
            else count++;
            res = Math.max(res, count);
        }
        return res;
    }
}