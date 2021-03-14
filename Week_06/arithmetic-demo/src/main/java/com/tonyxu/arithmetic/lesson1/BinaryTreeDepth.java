package com.tonyxu.arithmetic.lesson1;

/**
 * Created on 2020/11/18.
 *
 * @author <a href="191284969@qq.com">Tony xu</a>
 *
 * 给定一个二叉树，找出其最大深度:
 *
 * 解体思路：
 * 如果根节点为空,则深度为0,返回0,递归的出口。
 * 如果根节点不为空,那么深度至少为1,然后我们求他们左右子树的深度。
 * 比较左右子树深度值,返回较大的那一个,通过递归调用
 */
public class BinaryTreeDepth {

    public static void main(String[] args){

        TreeNode root = createTreeNode();

        //计算二叉树深度
        BinaryTreeDepth btd = new BinaryTreeDepth();int num = btd.depthOfTree(root);
            System.out.println("The depth of binaryTree is:"+num);
        }

        private int depthOfTree(TreeNode root){
            // 递归结束条件
            if(root == null){
                return 0;
            }
            // 左节点为空的情况
            if(root.leftNode == null){
                return depthOfTree(root.rightNode)+1;
            }
            // 右节点为空的情况
            if(root.rightNode == null){
                return depthOfTree(root.leftNode)+1;
            }
            //左右子节点都不为空，返回左右子树的最大深度加1
            return MaxDepth(depthOfTree(root.leftNode), depthOfTree(root.rightNode))+1;
        }

        private static TreeNode createTreeNode(){
            //创建二叉树
            TreeNode root = new TreeNode(1);
            TreeNode[] node = new TreeNode[6];
            for(int i=0; i<6; i++){
                node[i] = new TreeNode(i+2);
                System.out.println(node[i].value+" ");
            }
            root.leftNode = node[0];
            root.rightNode = node[1];
            node[0].leftNode = null;
            node[0].rightNode = node[3];
            node[1].leftNode = node[4];
            node[1].leftNode = node[5];
            return root;
        }

        private int MaxDepth(int a, int b){
            return a>b?a:b;
    }
}
