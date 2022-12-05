package Assignment8;
/*
F. Write a program to input a word from the user and remove the consecutive repeated characters by replacing the
sequence of repeated characters by its single occurrence.
Example:
Input –Jaaavvvvvvvvaaaaaaaaaaa
Output – Java
 */
import java.util.Scanner;

public class Assignment8F {
    String repCharacter(String s){
//        String t=""+s.charAt(0);
        String t="";
        for(int i=0;i<s.length();i++) {
//            if(!t.contains(String.valueOf(s.charAt(i))))
            if (i < s.length()-1 && s.charAt(i) == s.charAt(i + 1))
                continue;
            else
                t += s.charAt(i);
        }
        return  t;
    }
    public static void main(String[] args) {
        System.out.println("Enter a Word:");
        String s=new Scanner(System.in).nextLine();
        System.out.println( new Assignment8F().repCharacter(s));
    }
}
