package Assignment11;

class MyClass implements Runnable{
    int a,b;
    public MyClass(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        int c=a;
        int d=b;
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Add of a & b :"+(a+b));
    }
    void increase(){
        a+=5;
        b+=5;
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Increase Value a: "+a);
        System.out.println("Increase Value b: "+b);
    }
    public  void run(){
        add();
        increase();
    }
}

public class Assignment11B {

    public static void main(String[] args) {
        MyClass m=new MyClass(2,3);
        Thread t1=new Thread(m);
        Thread t2=new Thread(m);
        t1.start();
        t2.start();

    }
}
