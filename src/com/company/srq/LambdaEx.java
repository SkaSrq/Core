package com.company.srq;
interface Aman{
    public void eat();
}
interface Don{
    abstract void Don();
}
public class LambdaEx implements Don, Aman {
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    public static void main(String... args){
        Aman aman = new LambdaEx();
        Don d1 = new LambdaEx();
        aman.eat();
        d1.Don();
    }

    @Override
    public void Don() {
        System.out.println("beating");
    }
}
