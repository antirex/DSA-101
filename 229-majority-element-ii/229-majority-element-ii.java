class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max = nums.length/3;
        List<Integer> list = new ArrayList<>();
//         int[] freq = new int[nums.length+1];
        
//         for(int i=0; i<nums.length;i++) freq[nums[i]]++;
//         for(int i=0; i<freq.length;i++) if(freq[i]>max) list.add(i);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.getOrDefault(nums[i],1)+1);
        }
        for(int i =0;i<nums.length;i++) 
            if(map.get(nums[i])>max && !list.contains(nums[i])) list.add(nums[i]);
        return list;
    }
}