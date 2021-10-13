class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i: nums1){
            if(!hash.containsKey(i)) hash.put(i,1);
            else hash.put(i,hash.get(i)+1);
        }
        int temp = 0;
        for(int i: nums2){
            if( hash.containsKey(i) && hash.get(i)>0 ){
                nums2[temp++] = i;
                hash.put(i,hash.get(i)-1);
            }
        }
          return Arrays.copyOfRange(nums2, 0, temp);
    }
}