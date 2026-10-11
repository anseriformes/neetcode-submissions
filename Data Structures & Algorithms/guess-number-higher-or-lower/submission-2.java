/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        int result = 0;
        int pick, guess;

        while (result == 0) {
            pick = ((max - min) / 2) + min;
            guess = guess(pick);

            if (guess == 0) {
                result = pick;
            } else if (guess == -1) {
                max = pick-1;
            } else {
                min = pick+1;
            }
        }
        
        return result;
    }
}