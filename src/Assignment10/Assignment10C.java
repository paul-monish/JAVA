package Assignment10;

public class Assignment10C {
    public static void main(String[] args) {

        try{
            String a=null;
            System.out.println(a.length());
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("it is executed after try-catch block");
        }
    }
}
