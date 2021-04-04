package com.tonyxu.arithmetic.lesson1.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tony.xu
 * @version 1.0
 * @date 2020/11/22 19:10
 */
public class GenerateParenthesis {

    static List<String> result = new ArrayList<>();

    public static void main(String[] args){
        generateParenthesis(3);
        result.stream().forEach(System.out::println);
    }

    /**
     * 递归生成
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        if (n == 0) {
            return result;
        }
        if (n == 1) {
            result.add("()");
            return result;
        }
        dfs(n, n, "");
        return result;
    }

    /**
     * 通过暴力搜索，就是通过dfs。但是并不是每一个结果都符合要求，所以通过if来进行剪枝
     *
     * @param left
     * @param right
     * @param currentString
     */
    private static void dfs(int left, int right, String currentString) {
        // 左右括号都不剩余了，递归终止
        if (left == 0 && right == 0) {
            result.add(currentString);
            return;
        }
        // 如果左括号还剩余的话，可以拼接左括号，这里是一个剪枝的过程。
        if (left > 0) {
            dfs(left - 1, right, currentString + "(");
        }
        // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
        if (right > left) {
            dfs(left, right - 1, currentString + ")");
        }
    }
}
