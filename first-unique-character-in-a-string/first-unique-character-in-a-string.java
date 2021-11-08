class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
             map.put(temp,map.getOrDefault(temp,0)+1);
        }
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
            if(map.get(temp)==1) return i;
        }
        return -1;
    }
}