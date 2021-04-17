package com.company.srq.FacePrep;

import java.util.Scanner;

public class OddlyEven {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int oddSum =0, evenSum =0;
        char[] chararr = str.toCharArray();

        for(int i=0; i<str.length(); i++)
        {
            if(i%2==1)
            {
                evenSum += Character.getNumericValue(chararr[i]);
            }if(i%2==0)
            {
                oddSum += Character.getNumericValue(chararr[i]);
            }
        }
        int ans = Math.abs(evenSum - oddSum);
        System.out.println(evenSum+"  "+oddSum);
    }
}
