import com.test.AddMul;

class I implements AddMul {
    int a,b;
    public I(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void show() {
        add();
    }
}
class S implements AddMul {
    String a,b;
    public S(String a,String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void show() {
        add();
    }
}
class D implements AddMul {
    double a,b;
    public D(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void show() {
        add();
    }
}
public class Assignment12 {
    public static void main(String[] args) {
        new I(2,3).show();
        new S("monish","paul").show();
        new D(2.888,3.9999).show();

    }

}
