package com.tonyxu.arithmetic.lesson1.array;

import java.util.Arrays;

/**
 * Created on 2020/11/20.
 *
 * @author <a href="191284969@qq.com">Tony xu</a>
 */
public class SolutionArray {

    public static void main(String[] args){

       int[] nums = {11,15,13,3,2,7};

       int target = 9;

       Integer[] returnArray = twoSum(nums,target);

       if(returnArray!=null) {
           Arrays.asList(returnArray).stream().forEach(System.out::println);
       }

    }

    private static Integer[] twoSum(int[] nums,int target){

        // 记录值小于target的临时数组元素
        int temp;

        //int[] targetArray = returnTempArray(nums,target);

        Integer[] returnArray = new Integer[2];

        for(int i = 0; i< nums.length; i++){
            temp = nums[i];
            if(temp<target) {
                for (int j = 0; j < nums.length; j++) {
                    if (j!=i && nums[j]<target) {
                        int sum = temp + nums[j];
                        if (sum == target) {
                            returnArray[0] = i;
                            returnArray[1] = j;
                            return returnArray;
                        }
                    }
                }
            }
        }
        return null;
    }

}
