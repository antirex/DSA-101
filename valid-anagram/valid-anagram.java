class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()>t.length()) return false;
        else{
             HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            map.put(temp, map.getOrDefault(temp,0)+1);
        }
        for(int j = 0;j<t.length();j++){
            char temp = t.charAt(j);
            if(map.containsKey(temp) && map.get(temp)>0){
                map.put(temp, map.get(temp)-1);
            }else return false;
                
        }
        return true;
        }
    }
}