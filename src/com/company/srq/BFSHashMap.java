package com.company.srq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BFSHashMap {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String... args)
    {
        Tree  root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.left = new Tree(4);
        root.left.left = new Tree(10);
        root.right.right = new Tree(5);
        root.right.right.right = new Tree(6);
//        Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
//        levelOrder(root, 0, map);
//        System.out.print(map);
        levelOrder(root,1);

    }


    public static void levelOrder(Tree root, int level, Map<Integer, List<Integer>> map){
        if(root == null)
            return;
        List<Integer> list = map.get(level);
        if(list==null){
            List<Integer> newest = new ArrayList<Integer>();
            newest.add(root.data);
            map.put(level,newest);
        }else{
            list.add(root.data);
            map.put(level,list);
        }
        levelOrder(root.left,  level+1,map);
        levelOrder(root.right, level+1,map);

    }
    public static void levelOrder(Tree root,int level){
        if(root == null)
            return;
        if(level == 1)
        {
            System.out.print(root.data+" ");
        }
        levelOrder(root.left, level+1);
        levelOrder(root.right,level+1);
    }
}
