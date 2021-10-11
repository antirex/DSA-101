class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){//interchange the elements
            if(k+i>=nums.length) temp[(k+i) % nums.length] = nums[i]; //modulus is better than minus operation as the value of k might be greater than the size of the array
            else temp[k+i] = nums[i];
        }
        for(int i =0; i<temp.length;i++){//copy array temp to nums
            nums[i]=temp[i];
        }
    }
}