package com.company.srq.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode863 {
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val)
        {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void main(String... args)
    {
        LeetCode863 obj = new LeetCode863();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left  = new TreeNode(0);
        root.right.right = new TreeNode(8);

//        preorder(root);
//        Scanner sc = new Scanner(System.in);
//        int K = sc.nextInt();
//        int K = 2;
        List<Integer> print = obj.distanceK(root,5,2);
        for(int a:print)
            System.out.print(a+" ");

    }

   static void preorder(TreeNode root)
    {
        if(root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    List<Integer> list = new ArrayList<Integer>();
    boolean found = false;
    int temp = 0;
    public  List<Integer> distanceK(TreeNode root, int target, int K)
    {
        temp = K;
        helper(root,target,K,0);
        return list;

    }


    private  void helper(TreeNode root, int target, int k, int level)
    {
        if(root == null)
            return;
        if(root.val == target)
        {
            found = true;
            helper2(root,k);
            return;

        }

        helper(root.left, target,k,level+1);
        if(found)
        {
            temp--;
            if(temp == 0)
            {
                list.add(root.val);
            }
            else
            {
                helper2(root.right, temp-1);
            }
            return;
        }

        helper(root.right, target, k, level+1);
        if(found)
        {
            temp--;
            if(temp == 0)
            {
                list.add(root.val);
            }
            else
            {
                helper2(root.left,temp-1);
            }
            return;
        }

    }
    private void helper2(TreeNode root, int k)
    {
        if(k<0 || root == null)
        {
            return;
        }
        if(k == 0 && root!=null)
        {
            list.add(root.val);
            return;
        }
        helper2(root.left, k-1);
        helper2(root.right, k-1);
    }

}
