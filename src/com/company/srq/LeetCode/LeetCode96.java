package com.company.srq.LeetCode;

import java.util.Scanner;

public class LeetCode96
{
    public static void main(String... args)
    {
        LeetCode96 obj = new LeetCode96();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to Find Catalan Number. ");
        int n = scan.nextInt();
        long C = obj.catalan(2*n,n);
        System.out.println(C/(n+1));
    }
    long catalan(int n, int k)
    {
        long result = 1;
        if(k>n-k)
            k = n-k;
        for(int i=0; i<k; ++i)
        {
           result *= (n-i);
           result /= (i+1);
        }
        return result;
    }
}
