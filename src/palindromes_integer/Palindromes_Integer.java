package palindromes_integer;

/**
 * 是否是回文数
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

        /**
         * 利用回文数的性质，将数字倒置（利用求余，余数进位的思路），
         * 判断倒置后的数字和原数字是否相同即可
         */
        while(x!=0){
            y = y*10 + x%10 ;
            x /= 10 ;
        }
        if (y == tmp )
            return true;
        return false;
    }
}