package com.tonyxu.arithmetic.middleorderbinarytree;

import com.tonyxu.arithmetic.beans.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树中序遍历
 * @author Tony.xu 191284969@qq.com
 * @date 2021/2/7 5:27 下午
 */
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null){
            return res;
        }
        //非递归解决方案
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.isEmpty())
        {
            while(root != null)
            {
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty())
            {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }

}
