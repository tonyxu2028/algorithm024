package com.tonyxu.arithmetic.lesson1.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * Created on 2021/1/22.
 *
 * @author <a href="191284969@qq.com">Tony xu</a>
 */
public class Solution {

    public static void main(String[] args){
        List<Integer> resultList = new Solution().addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1);
        resultList.stream().forEach(System.out::println);
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuffer str = new StringBuffer();
        for (int i:A){
            str.append(i);
        }
        try{
            Integer result = Integer.parseInt(str.toString())+K;
            return changeStrToIntArray(result.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private List<Integer> changeStrToIntArray(String num){
        List<Integer> list = new ArrayList<>(num.length());
        for(int i = 0; i<num.length();i++){
            Character ch = num.charAt(i);
            list.add(Integer.parseInt(ch.toString()));
        }
        return list;
    }

}
