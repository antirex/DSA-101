class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i], 1);
            else map.put(arr[i], map.get(arr[i])+1);
            if(map.get(arr[i]) > arr.length/2) return arr[i];
        }
        return -1;
    }
}