package com.company.srq;

public class Demo{
    public static void main(String... args){
        int N = 3;
        System.out.println(divisorGame(N));

    }
    static int count;
    public static boolean divisorGame(int N) {
        int x=1;
        count =0;
        helper(N,x);
        return(count%2 ==1);

    }
    public static void helper(int N, int x){
        if(x>0 && x< N && N%x ==0){
            N = N-x;
            count++;
            System.out.println(count);
            helper(N,x);
        }
    }
}
