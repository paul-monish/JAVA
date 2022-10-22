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
