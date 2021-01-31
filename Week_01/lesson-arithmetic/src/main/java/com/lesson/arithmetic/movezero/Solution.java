package com.lesson.arithmetic.movezero;

import java.util.Arrays;

/**
 * @author tonyxu
 * @version 1.0
 * @date 2021/1/31 16:04
 */
public class Solution {

    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,3,12};
        new Solution().moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public void moveZeroes(int[] nums) {
        int noZeroIndex = 0;
        // 移动非零元素
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[noZeroIndex++] = nums[i];
            }
        }
        // 补充零
        for (int j = noZeroIndex; j<nums.length;j++){
            nums[j] = 0;
        }
    }

}
