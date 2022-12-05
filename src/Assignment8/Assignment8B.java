package Assignment8;
/*
B. Write a program that accepts a comma-separated sequence of words as input and prints the words in a commaseparated sequence after sorting them alphabetically.
Input Format: The first line of input contains words separated by the comma.
Output Format: Print the sorted words separated by the comma.
Example:
Input: without,hello,bag,world
Output: bag,hello,without,world
 */
import java.util.Scanner;

public class Assignment8B {
    void disp(String a[]) {
        for (String i : a) {
            System.out.print(i + ",");
        }

    }

    void sort(String a[]) {
        for (int i = 1; i < a.length; i++) {
            String n = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (n.compareTo(a[j])<0)
                    a[j + 1] = a[j];
                else
                    break;
            }
            a[j + 1] = n;
        }
        System.out.println();
        disp(a);
    }
    public static void main(String[] args) {
        System.out.println("Enter comma separated String:");
        String s=new Scanner(System.in).nextLine();
        String st[]=s.split(",");
        Assignment8B a=new Assignment8B();
        a.disp(st);
        a.sort(st);
    }
}
