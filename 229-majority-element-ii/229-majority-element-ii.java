class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max = nums.length/3;
        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0, major1 = Integer.MIN_VALUE, major2 = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==major1) count1++;
            else if(nums[i]==major2) count2++;
            else if(count1 == 0){
                count1 = 1;
                major1 = nums[i];
            }else if(count2 == 0){
                count2 = 1;
                major2 = nums[i];
            }  
            else{
              count1--;
              count2--;  
            } 
        }
        int realCount1 = 0, realCount2 = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==major1) realCount1++;
            else if(nums[i]==major2) realCount2++;
        }
        if(realCount1>max) list.add(major1);
        if(realCount2>max) list.add(major2);
            
        return list;
       
    }
}


//  HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i =0;i<nums.length;i++){
//             if(!map.containsKey(nums[i])) map.put(nums[i], 1);
//             else map.put(nums[i], map.getOrDefault(nums[i],1)+1);
//         }
//         for(int i =0;i<nums.length;i++) 
//             if(map.get(nums[i])>max && !list.contains(nums[i])) list.add(nums[i]);
//         return list;