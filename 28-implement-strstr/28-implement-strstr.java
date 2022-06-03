import java.util.regex.*;
class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if(needle.length()>0) index = haystack.indexOf(needle);
        return index;
    }
}