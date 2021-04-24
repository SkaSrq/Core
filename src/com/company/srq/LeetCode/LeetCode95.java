package com.company.srq.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode95 {
    static class TreeNode
    {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(){}
      TreeNode(int val)
      {
          this.val = val;
      }
      TreeNode(int val, TreeNode left, TreeNode right)
      {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static void main(String... args)
    {
     LeetCode95 obj = new LeetCode95();
     System.out.println("Enter Number to get List of HeadNode of Trees.");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     List<TreeNode> ans = obj.generateTrees(n);
     for(TreeNode c: ans)
     {
         obj.printTree(c);
         System.out.println();
     }

    }
    public void printTree(TreeNode head)
    {
        if(head == null)
        {
          return;
        }
        System.out.print(" "+head.val);
        printTree(head.left);
        printTree(head.right);
    }
    public List<TreeNode> generateTrees(int n)
    {
        if(n <1)
            return new ArrayList<TreeNode>();
        List<TreeNode> result = new ArrayList<TreeNode>();
        result = helper(1,n);
        return result;
    }
    static List<TreeNode> helper(int start, int end)
    {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start>end)
        {
            list.add(null);
            return list;
        }

        for(int i=start; i<=end; i++)
        {
            List<TreeNode> leftNode = helper(start, i-1);
            List<TreeNode> rightNode = helper(i+1, end);
            for(TreeNode left : leftNode)
            {
                for(TreeNode right : rightNode)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
