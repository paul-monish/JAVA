class MyClass{
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
}
class TT1 extends Thread{
    @Override
    public void run() {
        new MyClass(2,3).add();
    }
}
class TT2 extends Thread{
    @Override
    public void run() {
        new MyClass(4,6).increase();
    }
}
public class Assignment11B {

    public static void main(String[] args) {
        new TT1().run();
        new TT2().run();

    }
}
