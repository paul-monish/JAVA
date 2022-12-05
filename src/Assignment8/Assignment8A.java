package Assignment8;
/*
A. Write a program to accept a sentence.
Perform the following tasks:
(i) Convert the first letter of each word to uppercase and print the sentence.
(ii) Find the number of vowels and consonants in each word and display them with proper headings along with
the words.
Test your program with the following inputs.
Example
Input: God is great.
Output: God Is Great
Word Vowels Consonants
God     1       2
Is      1       1
Great   2       3

 */
import java.util.Scanner;

public class Assignment8A {
    int getVowel(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a'|| s.charAt(i)=='A')||
                    (s.charAt(i)=='e'|| s.charAt(i)=='E')||
                    (s.charAt(i)=='i'|| s.charAt(i)=='I')||
                    (s.charAt(i)=='o'|| s.charAt(i)=='O')||
                    (s.charAt(i)=='u'|| s.charAt(i)=='U')){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Enter a Sentence:");
        String s=new Scanner(System.in).nextLine();
        String st[]=s.split(" ");
//        StringBuffer ss[]=new StringBuffer[st.length];
//        for(int i=0;i<ss.length;i++)
//            ss[i]=new StringBuffer(st[i]);
        Assignment8A a=new Assignment8A();
        for(String i: st) {
            System.out.print(i.substring(0, 1).toUpperCase()+i.substring(1)+" ");
        }
        System.out.println("\n|   Word   |   Vowels   |   Consonants   |");
        for(String i: st) {
            System.out.println("|   "+i.substring(0, 1).toUpperCase()+i.substring(1)+
                    "   |   "+a.getVowel(i)+"   |   "+(i.length()-a.getVowel(i)+"   |")
            );
        }

    }
}
