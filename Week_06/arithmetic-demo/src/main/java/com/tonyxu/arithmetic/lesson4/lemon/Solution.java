package com.tonyxu.arithmetic.lesson4.lemon;

/**
 * @author tonyxu
 * @version 1.0
 * @date 2021/2/28 13:38
 */
public class Solution {

    public static void main(String[] args) {
        int [] test = new int[]{5,10,20,10,5};
        boolean result = new Solution().lemonadeChange(test);
        System.out.println(result);
    }

    public boolean lemonadeChange(int[] bills) {
        if(bills.length==0) {
            return  true;
        }

        //表示5元和10元的张数
        int[] change=new int[]{0,0};

        for (int bill : bills) {
            if (bill == 5) {
                change[0]++;
            } else if (bill == 10) {
                if (change[0] <= 0) {
                    return false;
                }
                change[1]++;
                change[0]--;
            } else {
                if (change[1] <= 0) {
                    if (change[0] < 3) {
                        return false;
                    }
                    change[0] -= 3;
                } else {
                    if (change[0] <= 0) {
                        return false;
                    }
                    change[1]--;
                    change[0]--;
                }
            }
        }
        return true;
    }

}
