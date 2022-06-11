package leetcode.editor.cn;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @see "https://leetcode.cn/problems/two-sum/"
 * @author liaojunyao
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    @Test
    public void test() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = new TwoSum().twoSum(nums, 9);
        System.out.println(ints[0] + ", " + ints[1]);

        int[] nums1 = new int[]{3, 3};
        int[] ints1 = new TwoSum().twoSum(nums1, 6);
        System.out.println(ints1[0] + ", " + ints1[1]);

        int[] nums2 = new int[]{3, 2, 4};
        int[] ints2 = new TwoSum().twoSum(nums2, 6);
        System.out.println(ints2[0] + ", " + ints2[1]);
    }

}
