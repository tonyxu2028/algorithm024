package com.tonyxu.arithmetic.lesson10.reverseString;

/**
 * Created with IntelliJ IDEA.
 * 反转字符串 II
 * @Author: Fenris
 * @Date: 2021/04/10/17:16
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(new Solution().reverseStr(s,k));
    }

    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i += 2 * k){
            int left = i;
            int right = (i + k - 1 < n) ? i + k -1 : n - 1;
            while (left <= right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}
