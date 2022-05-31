class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (arr1, arr2)->Integer.compare(arr1[0], arr2[0]));
        ArrayList<int[]> outputArr = new ArrayList<>();
        int[] currArr = intervals[0];
        outputArr.add(currArr);
        for(int[] temp: intervals){
            int curr_begin = currArr[0];
            int curr_end = currArr[1];
            int next_begin = temp[0];
            int next_end = temp[1];
            if(curr_end>=next_begin) currArr[1] = Math.max(curr_end, next_end);
            else{
                currArr= temp;
                outputArr.add(currArr);
            }
        }
        return outputArr.toArray(new int[outputArr.size()][]);
    }
}