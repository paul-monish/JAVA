import java.util.Scanner;


abstract class Figure2D{
    abstract  float calculateArea(float b,float h);
}
class Rectangle extends Figure2D{
    @Override
    float calculateArea(float b,float h) {
        return b*h;
    }
}
class Triangle extends  Figure2D{
    @Override
    float calculateArea(float b,float h) {
        return (0.5f)*b*h;
    }
}
public class Assignment9C {
    public static void main(String[] args) {
        System.out.println("Enter b and h value:");
        int b=new Scanner(System.in).nextInt();
        int h=new Scanner(System.in).nextInt();
        Figure2D r=new Rectangle();
        Figure2D t=new Triangle();
        System.out.println("Rect: "+r.calculateArea(b,h));
        System.out.println("Triangle: "+t.calculateArea(b,h));
    }
}
