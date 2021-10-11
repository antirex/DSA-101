class Solution {
    public int[] twoSum(int[] numbers, int target) {
//         for(int i =0;i<numbers.length-1;i++){ //o(n^2)
//             for(int j = i+1;j<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target) return new int[]{i+1,j+1};
//             }
//         }
//         return new int[]{-1,-1};

        int r = numbers.length-1;
        int l =0;
        while(l<r){ //O(n) Two pointer approach
            int temp = numbers[l] + numbers [r];
            if(temp == target) return new int[]{l+1,r+1};
            else if(temp>target) r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}
