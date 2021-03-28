package com.tonyxu.arithmetic.lesson3.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Tony.xu 191284969@qq.com
 * @date 2021/2/19 2:35 下午
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TreeNode {
    int val;
    TreeNode leftNode;
    TreeNode rightNode;
    public TreeNode (int val){
        this.val = val;
    }
}
