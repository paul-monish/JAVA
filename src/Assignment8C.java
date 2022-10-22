import java.util.Scanner;

public class Assignment8C {
    public static void main(String[] args) {
        System.out.println("Enter E-mail Address:");
        String s=new Scanner(System.in).nextLine();
        //String[] st=s.split("@")[1].split("\\.");
        System.out.println(s.split("[@.]")[1]);
    }
}
