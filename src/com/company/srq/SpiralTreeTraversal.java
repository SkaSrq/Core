package com.company.srq;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SpiralTreeTraversal {
    public static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static List<List<Integer>> result = new ArrayList<List<Integer>>();
    public static void main(String... args){

        SpiralTreeTraversal obj = new SpiralTreeTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        obj.spiralTreeTraversal(root);
        System.out.print(result);
    }
    public void spiralTreeTraversal(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> stack1 = new Stack<TreeNode>(); // right to left
        Stack<TreeNode> stack2 = new Stack<TreeNode>(); // left to right
        stack1.add(root);
        while(!stack1.empty()||!stack2.empty()){
            List<Integer> list = new ArrayList<Integer>();
            while(!stack1.empty()){
                TreeNode temp = stack1.peek();
                stack1.pop();
                list.add(temp.data );
                System.out.print(temp.data+" ");
                if(temp.right!=null){
                    stack2.add(temp.right);
                }
                if(temp.left!=null){
                    stack2.add(temp.left);
                }
            }
           result.add(list);
            list.removeAll(list);
            while(!stack2.empty()){
                TreeNode temp = stack2.peek();
                stack2.pop();
                list.add(temp.data);
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    stack1.add(temp.left);
                }
                if(temp.right!=null){
                    stack1.add(temp.right);
                }
            }
            result.add(list);
            list = null;
        }
    }
}
