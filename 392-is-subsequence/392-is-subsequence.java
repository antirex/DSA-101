class Solution {
    // HashSet<String> set = new HashSet<>();
    public boolean isSubsequence(String s, String t) {
        int i =0;
        for(int j=0;j<t.length();j++){
            if(s.length()==i) break;
            if(s.charAt(i)==t.charAt(j)) i++;
        }
        return s.length() == i;
        
        // String empty = "";
        // allCombo(t, empty);
        // if(set.contains(s)) return true;
        // return false;
       
    }
//     public void allCombo(String ip, String op){
//         if(ip.length()==0) set.add(op);
//         else{
//             String op1 = op;
//             String op2 = op;
//             op2 += ip.charAt(0);
//             ip = ip.substring(1); 
//             allCombo(ip, op1);
//             allCombo(ip, op2);
//         }
       
//     }
}