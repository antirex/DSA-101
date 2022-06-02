class Solution {
    public int romanToInt(String str) {
        int res = 0;
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
            char temp1 = str.charAt(i);
            char temp2 = str.charAt(i+1);
            if(map.get(temp1)<map.get(temp2)) res-=map.get(temp1);
            else res+=map.get(temp1);
        }
        res+= map.get(str.charAt(i));
        return res;
    }
}