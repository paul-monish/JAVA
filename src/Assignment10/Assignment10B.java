package Assignment10;

public class Assignment10B {
    public static void main(String[] args) {
        int a[]=new int[10];
        try{
            a[15]=5;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
