package com.tonyxu.arithmetic.lesson1.array;

import org.junit.jupiter.api.Test;

/**
 * Created on 2021/1/22.
 *
 * @author <a href="191284969@qq.com">Tony xu</a>
 */
public class TestSolution {

    @Test
    public void testParseInt(){
        String str = "999999999";
        Integer parseInt = Integer.parseInt(str);
        try {
            Integer result = parseInt.intValue() + 1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
