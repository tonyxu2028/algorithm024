package com.tonyxu.arithmetic.lesson10.firstCharacter;

/**
 * Created with IntelliJ IDEA.
 * 字符串中的第一个唯一字符
 * @Author: Fenris
 * @Date: 2021/04/10/17:19
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
        System.out.println(new Solution().firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        int [] count = new int[26];
        char[] chars = s.toCharArray();
        //先统计每个字符出现的次数
        for (int i = 0; i < s.length(); i++) {
            count[chars[i] - 'a']++;
        }
        //然后在遍历字符串s中的字符，如果出现次数是1就直接返回
        for (int i = 0; i < s.length(); i++) {
            if (count[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
