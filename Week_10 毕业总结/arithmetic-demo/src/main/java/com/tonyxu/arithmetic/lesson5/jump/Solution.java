package com.tonyxu.arithmetic.lesson5.jump;

/**
 * @author tonyxu
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(new Solution().jump(nums));
    }

    public int jump(int[] nums) {
        int i = 0;
        int res = 0;
        while (i < nums.length - 1) {
            int steps = nums[i];
            if (steps >= nums.length - 1 - i) {
                res++;
                break;
            }
            //跳到下一个最优的地方
            int max = nums[i + 1];
            int index = i + 1;
            for (int j = index; j <= i + steps && j < nums.length - 1; j++) {
                if (nums[j] + j - index >= max) {
                    max = nums[j];
                    index = j;
                }
            }
            res++;
            i = index;
        }
        return res;
    }
}
