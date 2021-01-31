package com.lesson.arithmetic.twosum;

/**
 * @author tonyxu
 * @version 1.0
 * @date 2021/1/31 14:45
 */
public class Solution {

    public static void main(String[] args){
        int[] nums = new int[]{3,3};
        int target = 6;
        new Solution().twoSum(nums,target);
    }

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        if (n < 2){
            return new int[]{};
        }
        for (int i = 0; i < n-1; i++) {
            // 每次j从i的下标后搜索
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
