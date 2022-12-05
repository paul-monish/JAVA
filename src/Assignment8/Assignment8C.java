package Assignment8;
/*
C. Assuming that we have some email addresses in the "username@companyname.com" format, please write
program to print the company name of a given email address. Both user names and company names are
composed of letters only.
Input Format: The first line of the input contains an email address.
Output Format: Print the company name in single line.
Example;
Input: john@google.com
Output: google

 */
import java.util.Scanner;

public class Assignment8C {
    public static void main(String[] args) {
        System.out.println("Enter E-mail Address:");
        String s=new Scanner(System.in).nextLine();
        //String[] st=s.split("@")[1].split("\\.");
        System.out.println(s.split("[@.]")[1]);
    }
}
