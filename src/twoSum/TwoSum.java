package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * created by hongrm on 2018/3/28 22:47
 */
public class TwoSum {
    public static void main(String[] args) {
         int sums[] = new int[2];
         sums[0] = 3;sums[1] = 3; //sums[2] = 4;
         int target[] = Solution.twoSum(sums,6);
         System.out.println(target[0]+"-------"+target[1]);
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int rest_val = target-nums[i];
            if(map.containsKey(rest_val) && (int)map.get(rest_val) != i){
                sums[0] = i;
                sums[1] =(int) map.get(target-nums[i]);
                return sums;
            }
        }

        return sums;
    }
}
