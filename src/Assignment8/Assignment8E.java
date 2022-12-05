package Assignment8;
/*
E. You want to know the ASCII value of all the names of your friends. Write a program in java to store n number of
names (n is the user input) in a single-dimensional array. Now create another array, which stores ASCII values of
the corresponding names. Finally, display the name having the highest ASCII value among the names.

 */
import java.util.Scanner;

public class Assignment8E {
    int getASCII(String s){
        int sum=0;
        for(int i=0;i<s.length();i++)
            sum+=(int)s.charAt(i);
        return sum;
    }
    String getMaxIndexString(int[] as,String[] st){
        int max=as[0];
        int i=0,maxI=0;
        for(;i<as.length;i++)
            if(as[i]>max){
                max=as[i];
                maxI=i;
            }
        return st[maxI];
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of names:");
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Assignment8E a=new Assignment8E();
        int n=sc.nextInt();
        String[] s=new String[n];
        System.out.println("Enter names:");
        for(int i=0;i<n;i++)
            s[i]=sc1.nextLine();

        int[] as=new int[n];
        for(int i=0;i<n;i++)
            as[i]=a.getASCII(s[i]);
        System.out.println("Maximum ASCII Assignment7.Name:");
        System.out.println(a.getMaxIndexString(as,s));
    }
}
