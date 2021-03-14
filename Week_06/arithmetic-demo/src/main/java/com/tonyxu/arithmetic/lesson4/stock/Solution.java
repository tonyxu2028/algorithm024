package com.tonyxu.arithmetic.lesson4.stock;

/**
 * @author tonyxu
 */
public class Solution {

    public static void main(String[] args) {
        int[] test = new int[]{7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(test));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) {
                profit += tmp;
            }
        }
        return profit;
    }
}
