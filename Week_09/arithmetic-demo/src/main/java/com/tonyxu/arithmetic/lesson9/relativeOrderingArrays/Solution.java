package com.tonyxu.arithmetic.lesson9.relativeOrderingArrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * 数组的相对排序
 * @Author: Leo.xu
 * @Date: 2021/04/04/10:03
 * @Description:
 */
public class Solution {

    private static final int NUM = 1001;

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 ={2,1,4,3,9,6};
        System.out.println(Arrays.toString(new Solution().relativeSortArray(arr1, arr2)));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        int[] res = new int[arr1.length];
        int index = 0;

        //统计arr1
        for (int item : arr1) {
            arr[item]++;
        }

        for (int item : arr2) {
            while(arr[item]-- > 0) {
                res[index] = item;
                ++index;
            }
        }
        for(int i = 0; i < NUM; ++i) {
            while (arr[i]-- > 0){
                res[index] = i;
                ++index;
            }
        }
        return res;
    }
}
