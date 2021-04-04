package com.company.srq.string;

public class StringBf {
    public static void main(String... args){
        String str = new String("aman");
        StringBuffer strbf = new StringBuffer("aman");
        StringBuilder stringBuilder = new StringBuilder("aman");
        stringBuilder.append(" don");
        strbf.append(" don");
        System.out.println(strbf);
        System.out.println(str);
        System.out.println(stringBuilder);
    }
}
