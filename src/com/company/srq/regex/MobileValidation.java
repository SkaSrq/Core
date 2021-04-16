package com.company.srq.regex;

public class MobileValidation {
    public static void main(String... args){
        String pattern = "^[6-9][0-9]{9}$";
        String a = "6207461259";
        if(pattern.matches(a)){
            System.out.println("Matched.");
        }
        else{
            System.out.println("Not Matched");
        }
    }
}
