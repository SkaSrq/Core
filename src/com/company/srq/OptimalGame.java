package com.company.srq;

import java.util.Scanner;

public class OptimalGame {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        OptimalGame obj = new OptimalGame();
       int[] arr = {8,15,3,7 };
          System.out.println(obj.answer(arr,0,arr.length-1));



    }
    public int answer(int[] arr, int s, int e){
        if(s==e){
            return arr[s];
        }
        if(s==e-1){
            return Math.max(arr[s],arr[e]);
        }
        return Math.max(arr[s]+
                Math.min(answer(arr,s+2,e),answer(arr,s+1,e-1)),
                arr[e]+Math.min(answer(arr,s+1,e-1),answer(arr,s,e-2)));
    }
}
