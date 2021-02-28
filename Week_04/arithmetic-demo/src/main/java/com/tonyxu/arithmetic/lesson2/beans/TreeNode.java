package com.tonyxu.arithmetic.lesson2.beans;

/**
 * @author Tony.xu 191284969@qq.com
 * @date 2021/2/7 5:29 下午
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
