package Assignment8;
/*
H. Given a string of odd length greater 7, return a string made of the middle three chars of a given String
Original String is JhonDipPeta
Middle three chars are Dip
Original String is Jasonay
Middle three chars are son
 */
import java.util.Scanner;

public class Assignment8H {
    String mid3String(String s){
        if(s.length()<7)
            return "Please give string has greater odd length 7 character...";
        else{
            int n=(s.length()-2)/2;
            return s.substring(n,n+3);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter string has greater odd length 7 character:");
        System.out.println(new Assignment8H().mid3String(new Scanner(System.in).nextLine()));
    }
}
