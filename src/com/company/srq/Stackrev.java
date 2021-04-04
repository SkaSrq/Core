package com.company.srq;


import java.util.Stack;

public class Stackrev {
    public static void main(String[] agrs){
        Stackrev obj = new Stackrev();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        obj.reverse(stack);
        System.out.println();
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }


    }
    public void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse(stack);
            inBottom(stack,temp);
        }
    }

    private void inBottom(Stack<Integer> stack, int temp) {
        if (stack.isEmpty()) {
            stack.push(temp);
        }
        else {
            int temp2 = stack.pop();
            inBottom(stack, temp);
            stack.push(temp2);
        }
    }
}
