package Assignment9;

abstract class Shaped{
    int a,b;
    abstract void area();
}
class Triangle1 extends Shaped{
    public Triangle1(int b,int h) {
        super.a=b;
        super.b=h;
    }

    void area(){
        System.out.println("Assignment9.Triangle Area= "+(super.a*super.b)/2);
    }
}
class Rectangle1 extends Shaped{
    public Rectangle1(int b,int h) {
        super.a=b;
        super.b=h;
    }
    void area(){
        System.out.println("Assignment9.Rectangle Area= "+(super.a*super.b));
    }
}
class Circle1 extends Shaped{
    public Circle1(int r) {
        super.a=r;
    }
    void area(){
        System.out.println("Circle Area= "+(Math.pow(super.a,2)*3.14f));
    }
}
public class Assignment9E {
    public static void main(String[] args) {
        new Triangle1(2,3).area();
        new Rectangle1(2,3).area();
        new Circle1(2).area();
    }
}
