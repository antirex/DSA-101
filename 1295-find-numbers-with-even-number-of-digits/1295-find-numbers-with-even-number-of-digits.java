class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(checkNum(nums[i])) count++;
        }
        return count;
    }
    public boolean checkNum(int num) {
        if(num<10) return false;
        int dig = 0;
        while(num!=0){
            num =num/10;
            dig++;
        }
        if(dig%2 == 0) return true;
        return false;
    }
}