package com.company.srq;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ReverseLine {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        ReverseLine obj = new ReverseLine();
        String str = scan.nextLine();
//        System.out.println(obj.reverseHelper(str));
        Stack <String> stack = new Stack<String>();
        stack.add("md");
        stack.add("Sharique");
        stack.add("aman");
        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()){
            System.out.println(stack.pop());
        }
    }

    public String reverseHelper(String str){
        Stack<String> stack = new Stack<String>();
        String mystr=null;
        int j=0;
        char[] arr = str.toCharArray();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==' '){
                String my=str.substring(j,i);
                stack.add(my);
                j=i;
            }
        }
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            mystr+= stack.pop();
        }
        return mystr;
    }
}
