package com.company.srq.FacePrep;

import java.util.Scanner;

public class MintingMints {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        int fm = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int temp = fm;
        int sum =0;
        while(n-->0){
            sum+=temp;
            temp = sum-1;
        }
        System.out.println(sum);
    }
}
