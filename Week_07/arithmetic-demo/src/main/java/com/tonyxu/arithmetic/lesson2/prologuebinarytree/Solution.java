package com.tonyxu.arithmetic.lesson2.prologuebinarytree;

import com.tonyxu.arithmetic.lesson2.beans.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树前序遍历
 * @author Tony.xu 191284969@qq.com
 * @date 2021/2/7 5:27 下午
 */
public class Solution {

        public List<Integer> preorderTraversal (TreeNode root){
            List<Integer> res = new ArrayList<Integer>();
            if (root == null) {
                return res;
            }
            //非递归解决方案
            Stack<TreeNode> stack = new Stack<TreeNode>();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    res.add(root.val);
                    stack.push(root);
                    root = root.left;
                }
                if (!stack.isEmpty()) {
                    root = stack.pop();
                    root = root.right;
                }
            }
            return res;
        }
}

