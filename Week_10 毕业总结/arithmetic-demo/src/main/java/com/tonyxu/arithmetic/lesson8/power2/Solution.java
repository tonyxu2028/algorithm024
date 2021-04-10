package com.tonyxu.arithmetic.lesson8.power2;

/**
 * Created with IntelliJ IDEA.
 * 2的幂
 * @Author: Leo.xu
 * @Date: 2021/03/28/9:36
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(16));
        System.out.println(new Solution().isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
