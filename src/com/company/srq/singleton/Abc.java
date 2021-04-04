package com.company.srq.singleton;

import org.w3c.dom.ls.LSOutput;

public class Abc {
    private static Abc obj = new Abc();
    static int a = 10;
    private Abc(){
    }
    public static Abc getInstance(){
        return obj;
    }
    void replace(int b){
        a = b;
        System.out.println(a);
    }



}
