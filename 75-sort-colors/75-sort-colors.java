class Solution {
    public void sortColors(int[] nums) {
       int zeros = 0;
       int ones = 0;
       int twos = 0;
       int i =0;
       for(int k =0;k<nums.length;k++){
           if(nums[k] == 0) zeros++;
           else if(nums[k] == 1) ones++;
           else twos++;
       }
       while(zeros>0){
          nums[i++] = 0;
          zeros--;
       }
        while(ones>0){
          nums[i++] = 1;
          ones--;
       }
        while(twos>0){
          nums[i++] = 2;
          twos--;
       }
    }
}