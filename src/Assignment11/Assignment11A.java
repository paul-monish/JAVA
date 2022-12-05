package Assignment11;

class T1 extends Thread{
    @Override
    public synchronized void run() {
        for(int i=1;i<=10;i++)
            System.out.println(i);
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for(int i=10;i>=1;i--){
            if(i==6){
                try {
                    Thread.sleep(10000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }

    }
}
public class Assignment11A {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
    }
}
