package com.company.srq.recurtion;

public class TOH {
    static void tohfunction(int n, char s, char a, char d){
        if(n==1){
            System.out.println("move disk 1 from "+s+" to "+ d);
            return;
        }
        tohfunction(n-1,s,d,a);
        System.out.println("Move disk "+(n)+" from "+s+ " to "+d);
        tohfunction(n-1,a,s,d);
    }
    public static void main(String... args){
        tohfunction(3,'S','A','D');
    }
}
