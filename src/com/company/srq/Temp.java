package com.company.srq;

import java.math.BigInteger;
import java.util.Scanner;

public class Temp {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            while(T-->0){
                BigInteger a;
                long N = scan.nextLong();
                int first = noOfDigit(N);
                System.out.println(first);
                int second = noOfDigit(N+1);
                System.out.println(second);
               long multiplication= schonhageStrassenMultiplication(N,N,first,second);
                System.out.println(multiplication);
                long totalSum =multiplication/2;
                if(totalSum%2==1){
                    System.out.println(0);
                }
                else{
                    helper(totalSum,N);
                }

            }
        }
        public static void helper(long totalSum, long N){
            long half = totalSum/2;
            long mysum =0;
            long D = 1+(4*totalSum);
            long x = ((long)Math.sqrt(D)-1)/2;
            mysum = x*(1+x)/2;
            long count = N-x;

            if(mysum == half){
                long temp = N-count;
                long tsum =0;
                tsum = (temp*(temp-1))/2+ (count*(count-1))/2 + count;
                System.out.println(tsum);
            }
            else{
                System.out.println(count);
            }
        }

    public static int noOfDigit(long a)
    {
        int n=0;
        while(a>0)
        {
            a /= 10;
            n++;
        }
        return n;
    }
    public static long schonhageStrassenMultiplication(long x, long y, int n, int m)
    {

        int []linearConvolution = new int[n+m-1];
        for(int i=0; i<(n+m-1); i++)
            linearConvolution[i] = 0;

        long p=x;
        for(int i=0; i<m; i++)
        {
            x = p;
            for(int j=0; j<n; j++)
            {
                linearConvolution[i+j] += (y%10) * (x%10);
                x /= 10;
            }
            y /= 10;
        }

        long product = 0;
        int nextCarry=0, base=1;;
        for(int i=0; i<n+m-1; i++)
        {
            linearConvolution[i] += nextCarry;
            product = product + (base * (linearConvolution[i]%10));
            nextCarry = linearConvolution[i]/10;
            base *= 10;
        }
        return product;

    }

}
