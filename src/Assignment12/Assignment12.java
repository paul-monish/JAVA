package Assignment12;

import com.test.AddMul;

class I implements AddMul {
    int c;double d;String s;
    public void add(int a,int b){
        c=a+b;
    }
    public void add(String a,String b){
        s=a+b;
    }
    public void add(double a,double b){
        d=a+b;
    }
    public void show(){
        System.out.println("Add Implementation:"+c);
        System.out.println("String Implementation"+s);
        System.out.println("Double Implementation"+d);
    }
}
public class Assignment12 {
    public static void main(String[] args) {
        I i=new I();
        i.add(2,3);
        i.add(2.88888,9.66666);
        i.add("Monish ","Paul");
        i.show();

    }

}
