class Solution {
    public boolean isPerfectSquare(int num) {
        int check=1;
        while(check<=num/check){
            if((num%check==0)&&(num/check==check)){
                return true;
            }
            check++;
        }
        return false;
    }
}