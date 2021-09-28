class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>(); //better tahn stack class
        boolean res = false;
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp == '{' || temp == '[' ||temp == '('){
                stack.push(temp);  
            }
            if (stack.isEmpty())
                return res;
            char check;
            switch (temp) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return res;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return res;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return res;
                break;
            }
            
        }
        return (stack.isEmpty());
    }
}