class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        for(int i = m;i<(m+n);i++,j++){ // we can have two variables to increment in each loop iteration
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}