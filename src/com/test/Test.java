package com.test;
class AA extends Thread {
    synchronized public void run(){

        for(int i=0;i<10;i++){
            if(i==3) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i);
        }

    }
}
class BB extends Thread{
    public void run(){
        for(int i=10;i>0;i--)
            System.out.println(i);
    }
}

public class Test {

    public static void main(String[] args) throws ArithmeticException{
        AA a=new AA();
        a.start();
        new BB().start();
    }
}
