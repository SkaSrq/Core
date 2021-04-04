package com.company.srq.factory;

public class MyDemo {
    public static void main(String... a){
     Factory obj = new Factory();
     OS os = obj.getInstance("open");
     os.print();
    }
}
