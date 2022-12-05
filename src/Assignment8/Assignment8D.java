package Assignment8;
/*
D. The encryption of alphabets are to be done as follows:
A=1
B=2
C=3
. . .
Z = 26
The potential of a word is found by adding the encrypted value of the alphabets.
Example: KITE
Potential = 11 + 9 + 20 + 5 = 45
Accept a sentence. Each word of sentence is separated by single space. Decode the words according to their
potential and arrange them in ascending order. Output the result in the format given below:
Example 1
Input : THE SKY IS THE LIMIT.
POTENTIAL :
THE = 33
SKY = 55
IS = 28
THE = 33
LIMIT = 63
OUTPUT : IS THE THE SKY LIMIT
 */
import java.util.Scanner;

public class Assignment8D {
    void disp(String a[]) {
        for (String i : a) {
            System.out.print(i + " ");
        }

    }

    void sort(String a[]) {
        for (int i = 1; i < a.length; i++) {
            String n = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (getPotential(n)<=getPotential(a[j]))
                    a[j + 1] = a[j];
                else
                    break;
            }
            a[j + 1] = n;
        }
        System.out.println();
        disp(a);
    }
    int getPotential(String s){
        int sum=0;
        for(int i=0;i<s.length();i++)
            sum+=((int)s.charAt(i)-64);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter A Sentence:");
        String s=new Scanner(System.in).nextLine();
        String st[]=s.split(" ");
        Assignment8D a=new Assignment8D();
        System.out.println("POTENTIAL: ");
        for(String ss:st){
            System.out.println(ss+" = "+a.getPotential(ss));
        }
        a.sort(st);
    }
}
