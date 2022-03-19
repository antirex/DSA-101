class Solution {
    public int longestConsecutive(int[] arr) {
       if(arr.length == 0) return 0;
        Arrays.sort(arr);
        int count = 1, maxCount = 1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                if(arr[i]+1==arr[i+1]) count++;
                else count=1;
            } 
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}