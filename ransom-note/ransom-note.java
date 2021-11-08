class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        else{
            HashMap<Character,Integer> mapMag = new HashMap<>();
            for(int i =0;i<magazine.length();i++){
                char temp = magazine.charAt(i);
                mapMag.put(temp,mapMag.getOrDefault(temp,0)+1); //if null then 0 else add +1 to existing          
            }
            for(int i =0;i<ransomNote.length();i++){
                char temp = ransomNote.charAt(i);
                if(mapMag.containsKey(temp) && mapMag.get(temp)>0) {
                    mapMag.put(temp,mapMag.get(temp)-1);
                    continue;
                }
                else return false;
            }
        }
        return true;
    }
}
