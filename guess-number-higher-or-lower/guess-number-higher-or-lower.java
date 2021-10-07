/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int right = n;
        int left = 1;
        while(left<right){
            int mid = left + (right - left)/2;
            int temp = guess(mid);
            if(temp == 1) left = mid + 1;
            else if(temp == -1) right = mid;
            else return mid;
        }
        return left;
    }
}