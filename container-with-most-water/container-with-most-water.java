class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int start = 0;
        int end = height.length - 1;

        //O(n^2) approach Brute force
        // for(int i = 0;i< height.length;i++){
        //     for(int j = i+1; j<height.length;j++){
        //         int min = Math.min(height[i],height[j]);
        //         maxWater = Math.max(maxWater,min*(j-i));
        //     }
        // }
        // return maxWater;

        while(start<end){
            int min = Math.min(height[start],height[end]);
            maxWater = Math.max(maxWater,min*(end-start));
            if(height[start]>height[end]){
                end--;
            }else start++;
        }
        return maxWater;
    }
}