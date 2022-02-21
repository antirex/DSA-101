class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
     private int[] mergeAll(int[] left, int[] right){
    int i=0,j=0,k=0;
    int[] merged = new int[left.length + right.length];
    while(i<left.length && j<right.length){
        if(left[i] <= right[j]){
            merged[k] = left[i];
            k++;
            i++;
        } else{
            merged[k] = right[j];
            k++;
            j++;
        }
    }
    while(i<left.length){
            merged[k] = left[i];
            i++;
            k++;
    }
    while(j<right.length){
            merged[k] = right[j];
            k++;
            j++;
    }
    return merged;
}

private int[] mergeSort(int[] nums,int lo,int hi){
    if(lo == hi){
        int[] base = new int[1];
        base[0] = nums[lo];
        return base;
    }
    int mid = (lo+hi)/2;
    int[] left = mergeSort(nums, lo, mid);
    int[] right = mergeSort(nums, mid+1, hi);
    int[] merged = mergeAll(left, right);
    return merged;
}
}
