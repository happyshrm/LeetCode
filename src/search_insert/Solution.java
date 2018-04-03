package search_insert;

/**
 * 见 35. Search Insert Position
 * created by hongrm on 2018/4/3 21:38
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null)
            return 0;
        if (nums[0] > target)
            return 0;
        if (nums[nums.length - 1] < target)
            return nums.length;
        int head = 0, tail = nums.length - 1, mid = (tail + head) / 2;
        while (head < tail) {
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                head = mid + 1;
                mid = (tail + head) / 2;
            } else {
                tail = mid - 1;
                mid = (tail + head) / 2;
            }

        }
        //最终 target 的位置
        if (target > nums[mid])
            return head + 1;
        return head;
    }
}
