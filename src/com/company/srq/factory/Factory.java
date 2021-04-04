package com.company.srq.factory;

public class Factory {
      public OS getInstance(String str){
         if(str.equals("open")){
             return new Nokia();
         }
         else return new Iphone();
    }
}
