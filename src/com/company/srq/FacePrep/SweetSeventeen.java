package com.company.srq.FacePrep;

import java.util.Scanner;

public class SweetSeventeen {
    public static void main(String args[])
    {
        //Try out your code here
        Scanner scan = new Scanner(System.in);
        String hexVal = scan.nextLine();
        int n = hexVal.length();
        int base = 1;
        int dec_val = 0;
        for(int i = n-1; i>=0; i--){
            if (hexVal.charAt(i) >= '0'
                    && hexVal.charAt(i) <= '9') {
                dec_val += (hexVal.charAt(i) - 48) * base;
                base = base * 17;
            }
            else if (hexVal.charAt(i) >= 'A'
                    && hexVal.charAt(i) <= 'G') {
                dec_val += (hexVal.charAt(i) - 55) * base;

                base = base * 17;
            }
        }
        System.out.println(dec_val);

    }
}
