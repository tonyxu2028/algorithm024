package com.tonyxu.arithmetic.lesson1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/11/16.
 *
 * @author <a href="191284969@qq.com">Tony xu</a>
 */
public class ArraySolution {

    public static void main(String[] args){

        // 集合_处理方式
        int[] nums = {0,1,1,1,3,3,4,4,5,4};
        Arrays.sort(nums);
        List numList = showSet(nums);
        System.out.print("集合_处理方式:::");
        numList.stream().forEach(item->System.out.print(item));
        System.out.println();

        // 非集合_处理方式
        nums = new int[]{0,1,1,1,3,3,4,4,5,4};
        Arrays.sort(nums);
        numList = removeDuplicates(nums);
        System.out.print("非集合_处理方式:::");
        numList.forEach(item->System.out.print(item));
    }

    /**
     * 通过Set的处理方式
     * @param nums
     * @return
     */
    private static List showSet(int[] nums){
        Set<Integer> setNums = new HashSet();
        for(Integer item:nums){
            setNums.add(item);
        }
        return Arrays.asList(setNums.toArray());
    }

    private static List<Integer> removeDuplicates(int[] nums){
        List<Integer> returnList = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i<nums.length; i++){
            if(i==0){
                temp = nums[i];
                returnList.add(temp);
            }
            if(nums[i]!=temp){
                temp = nums[i];
                returnList.add(temp);
            }
        }
        return returnList;
    }

}
