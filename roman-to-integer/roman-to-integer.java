class Solution {
    public int romanToInt(String str) {
        int result = 0;
        int i;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(i = 0; i<str.length()-1; i++){
            char currValue = str.charAt(i);
            char nextValue = str.charAt(i+1);
            if(map.get(currValue)<map.get(nextValue)){
                result += map.get(nextValue) - map.get(currValue);
                i++;
            } else{
                result += map.get(currValue);
            }
        }
        if(i==str.length()-1) result+= map.get(str.charAt(i));
        return result;
    }
}