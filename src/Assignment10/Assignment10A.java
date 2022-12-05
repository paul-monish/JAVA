package Assignment10;

public class Assignment10A {
    public static void main(String[] args) {
        int a=5,b=0;
        int c;
        try{
            c=a/b;
        }
        catch(ArithmeticException e){
           e.printStackTrace();
        }
    }
}
