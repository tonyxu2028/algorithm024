package com.tonyxu.arithmetic.lesson7.bracketgeneration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 括号生成
 * @Author: Leo.xu
 * @Date: 2021/03/21/9:17
 * @Description:
 */
public class Solution {

    List<String> output = new ArrayList<>();

    public static void main(String[] args) {
        List<String> result = new Solution().generateParenthesis(3);
        for (String str:result) {
            System.out.println(str);
        }
    }

    public List<String> generateParenthesis(int n) {
        if(n == 0){
            return output;
        }
        String first = "";
        getOutput(first, n, n);
        return output;
    }

    private void getOutput(String str,int left,int right){
        if(left == 0 && right == 0){
            output.add(str);
            return;
        }
        if(left == right){
            getOutput(str + "(",left - 1,right);
        }
        else{
            if(left > 0){
                //置右括号
                getOutput(str + "(",left - 1,right);
            }
            getOutput(str + ")",left,right - 1);
        }
    }
}
