package com.company.srq;
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i+" Thread Class");
        }
    }


}
public class ThreadDemo {
    public static void main(String... args){
        ThreadDemo thread1 = new ThreadDemo();
        MyThread obj = new MyThread();
        thread1.threadMethod();
        obj.start();

    }

    private void threadMethod() {
        for(int j=0; j<=10;j++){
        System.out.println(j+" Main class");
    }

    }
}
