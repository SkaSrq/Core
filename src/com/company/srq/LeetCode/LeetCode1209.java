package com.company.srq.LeetCode;

import java.util.Scanner;

public class LeetCode1209 {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        System.out.println(removeDuplicates(s,k));

    }
    public static String removeDuplicates(String s, int k) {
        int cnt = 1;
        char last = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur==last){
                cnt++;
            }else{
                cnt = 1;
                last = cur;
            }

            if(cnt == k)
                return removeDuplicates(s.substring(0,i-k+1)+s.substring(i+1),k);
        }
        return s;
    }
}
