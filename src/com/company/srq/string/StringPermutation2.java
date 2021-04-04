package com.company.srq.string;

public class StringPermutation2 {
    public static void main(String... args){
        perm("abc","");

    }
    public static void perm(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        else{
            for(int i=0; i<str.length();i++){
                char c = str.charAt(i);
                String temp = str.substring(0,i)+str.substring(i+1);
                perm(temp,ans+c);
            }
        }
    }
}
