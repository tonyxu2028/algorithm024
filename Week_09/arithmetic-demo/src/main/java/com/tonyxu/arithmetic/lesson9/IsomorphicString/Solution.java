package com.tonyxu.arithmetic.lesson9.IsomorphicString;

/**
 * Created with IntelliJ IDEA.
 * 同构字符串
 * @Author: Leo.xu
 * @Date: 2021/04/04/10:00
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(new Solution().isIsomorphic(s,t));
    }

    public boolean isIsomorphic(String s, String t) {
        int[] sm = new int[128];
        int[] tm = new int[128];
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(sm[sc[i]] != tm[tc[i]]) {
                return false;
            }
            sm[sc[i]] = tm[tc[i]] = i+1;
        }
        return true;
    }
}
