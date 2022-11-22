interface  A{
    default void show(){
        System.out.println("Interface A");
    }
}
interface B{
    default void show(){
        System.out.println("Interface B");
    }
}
class C implements A,B{
    public void show(){
        A.super.show();
        B.super.show();
    }
}
public class Assignment9F {
    public static void main(String[] args) {
        new C().show();
    }
}
