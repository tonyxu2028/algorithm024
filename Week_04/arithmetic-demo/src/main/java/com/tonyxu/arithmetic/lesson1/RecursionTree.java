package com.tonyxu.arithmetic.lesson1;

import java.util.Stack;

/**
 * Created on 2020/11/17.
 *
 * @author <a href="191284969@qq.com">Tony xu</a>
 */
public class RecursionTree {

    public static void main(String[] args){
        TreeNode[] recursionTree = createTree();

        // 递归实现_前序遍历
        System.out.println("递归实现_前序遍历 :::: ");
        preOrderRecursion(recursionTree[0]);

        // 非递归实现_前序遍历
        System.out.println("非递归实现_前序遍历 :::: ");
        preOrderNoRecursion(recursionTree[0]);

    }

    /**
     * 以数组形式生成一棵完全二叉树
     * @return 生成的二叉树
     */
    private static TreeNode[] createTree(){
        TreeNode[] node = new TreeNode[10];
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10) {
                node[i].leftNode = node[i * 2 + 1];
            }
            if(i*2+2 < 10) {
                node[i].rightNode = node[i * 2 + 2];
            }
        }
        return node;
    }

    /**
     * 递归实现_前序遍历
     * @param biTree
     */
    public static void preOrderRecursion(TreeNode biTree){
        System.out.println(biTree.value);
        TreeNode leftTree = biTree.leftNode;
        if(leftTree != null)
        {
            preOrderRecursion(leftTree);
        }
        TreeNode rightTree = biTree.rightNode;
        if(rightTree != null)
        {
            preOrderRecursion(rightTree);
        }
    }

    /**
     * 非递归实现_前序遍历
     * @param biTree
     */
    public static void preOrderNoRecursion(TreeNode biTree)
    {//非递归实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(biTree != null || !stack.isEmpty())
        {
            while(biTree != null)
            {
                System.out.println(biTree.value);
                stack.push(biTree);
                biTree = biTree.leftNode;
            }
            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                biTree = biTree.rightNode;
            }
        }
    }
}

