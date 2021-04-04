package com.company.srq.string;

public class StringPermutation {
    public static void main(String[] args){
        String str = "abc";
        permutation(str,0,str.length());

    }
    public static String swap(String temp, int i, int j){
        char[] chars = temp.toCharArray();
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
        return String.valueOf(chars);
    }

    public static void permutation(String str, int start, int end){
        if(start==end-1){
            System.out.println(str);
        }
        else{
            for(int i=start; i<end; i++){
                str = swap(str,start,i);
                permutation(str,start+1,end);
                str = swap(str,start,i);
            }
        }

    }
}
