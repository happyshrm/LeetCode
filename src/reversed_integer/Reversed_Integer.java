package reversed_integer;

/**
 * 数字倒置
 * created by hongrm on 2018/3/29 21:05
 */
public class Reversed_Integer {
    public static void main(String[] args) {
        System.out.println(Solution.reverse(190009990));
    }
}

class Solution{
    public static int reverse(int x){
        if (x==0){
            return 0;
        }
        int ret = 0;
        while (x!=0){
            if (ret>2147483647/10 || ret < -2147483647/10){
                return 0;
            }
            ret = ret*10 + x%10 ;
            x = x/10;
        }
        return ret;
    }
}

