class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        else{
            HashMap<Character,Integer> mapMag = new HashMap<>();
            for(int i =0;i<magazine.length();i++){
                if(mapMag.get(magazine.charAt(i))!=null) mapMag.put(magazine.charAt(i),mapMag.get(magazine.charAt(i))+1);
                else mapMag.put(magazine.charAt(i),1);
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