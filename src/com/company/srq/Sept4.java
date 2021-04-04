package com.company.srq;

import java.util.Scanner;

public class Sept4 {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            int N = scan.nextInt();
            int[] arr = new int[N];
            int tsum=0;
            for(int i=0; i<N; i++){
                arr[i] = i+1;
                tsum+=arr[i];
            }
            if(tsum%2==1){
                System.out.println(0);
            }
            else{

                helper(arr,0,N-1,tsum);
            }
        }
    }

    public static void helper(int[] temparr, int start, int end, int sum){
        int count=0;
        int N = temparr.length;
        for(int i=0; i<=N; i++){
            for(int j= N-1;j>i;j--){
                swap(temparr, i, j);
                int tempsum=0;
                for(int k=0; k<N;k++){
                    tempsum += temparr[k];
                    if(sum-tempsum == tempsum){
                        count++;
                    }
                }
                swap(temparr, i, j);
            }
        }
        System.out.println(count);
    }
    public static void swap(int[] temparr, int i, int j){
        int temp = temparr[i];
        temparr[i] = temparr[j];
        temparr[j] = temp;
    }

}
