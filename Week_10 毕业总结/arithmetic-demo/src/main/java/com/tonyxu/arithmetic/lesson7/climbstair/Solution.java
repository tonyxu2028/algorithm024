package com.tonyxu.arithmetic.lesson7.climbstair;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * 爬楼梯
 * @Author: Leo.xu
 * @Date: 2021/03/21/9:17
 * @Description:
 */
public class Solution {

    private static final int NUM = 3;

    public static Map<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(2));
    }

    public int climbStairs(int n) {
        if(n<NUM) {
            return n;
        } else {
            int x,y;
            if((map.get(n-1) != null) &&
                    (map.get(n-2) != null)){
                x = map.get(n-1);
                y= map.get(n-2);
            }else {
                x = climbStairs(n-1);
                y = climbStairs(n-2);
                map.put(n-1,x);
                map.put(n-2,y);
            }
            return x+y;
        }
    }
}
