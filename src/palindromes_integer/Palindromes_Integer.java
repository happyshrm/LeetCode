package palindromes_integer;

/**
 * created by hongrm on 2018/3/29 21:40
 */
public class Palindromes_Integer {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(9889));
    }
}
class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if (x == 0){
            return true;
        }
        int tmp = x;
        int y = 0 ;
        while(x!=0){
            y = y*10 + x%10 ;
            x /= 10 ;
        }
        if (y == tmp )
            return true;
        return false;
    }
}