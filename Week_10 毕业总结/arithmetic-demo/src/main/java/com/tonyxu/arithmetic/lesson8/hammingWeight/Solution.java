package com.tonyxu.arithmetic.lesson8.hammingWeight;

/**
 * Created with IntelliJ IDEA.
 *  位1的个数
 * @Author: Leo.xu
 * @Date: 2021/03/28/9:39
 * @Description:
 */
public class Solution {

    private static final int NUM = 32;

    public static void main(String[] args) {
        String num = "00000000000000000000000000001011";
        System.out.println(new Solution().hammingWeight(Integer.parseInt(num)));
    }

    public int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < NUM; i++) {
            ans += ((n >> i) & 1);
        }
        return ans;
    }
}
