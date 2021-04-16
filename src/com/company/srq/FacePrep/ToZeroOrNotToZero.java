package com.company.srq.FacePrep;

import java.util.Scanner;

public class ToZeroOrNotToZero {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        int n = str[1].length();
        switch(n){
            case(1) :
                for(int i=start; i<=end;i++){
                    System.out.print(i+ " ");}
                break;
            case(2):
                for(int i=start; i<=end; i++){
                    System.out.printf("%02d ",i);
                }
                break;
            case(3):for(int i=start; i<=end; i++){
                System.out.printf("%03d ",i);
            }
                break;
        }
    }
}
