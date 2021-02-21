package com.tonyxu.arithmetic.lesson3.commonancestortree;

import com.tonyxu.arithmetic.lesson3.beans.TreeNode;

/**
 * 二叉树的最近公共祖先
 * @author Tony.xu 191284969@qq.com
 * @date 2021/2/19 3:15 下午
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.getLeftNode(), p, q);
        TreeNode right = lowestCommonAncestor(root.getRightNode(), p, q);
        if(left == null) {
            return right;
        }
        if(right == null) {
            return left;
        }
        return root;
    }
}
