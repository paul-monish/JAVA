package Assignment9;

import java.util.Scanner;

abstract class Number{
    int num;
    abstract void dispName(int n);
}
class HexNum extends Number{
    @Override
    void dispName(int n) {
//        int rev=0,rev1=0;
//        while(n!=0){
//            int a=n%16;
//            n=n/16;
//            rev=rev*10+a;
//        }
//        while(rev!=0){
//            int a=rev%10;
//            rev=rev/10;
//            rev1=rev1*10+a;
//        }
        int c=1,dn=n,hn=0;
        while(dn!=0){
            int rem=dn%16;
            hn+=rem*c;
            c*=10;
            dn/=16;
        }
        System.out.println(hn);

    }
}
class OctalNum extends Number{
    @Override
    void dispName(int n) {
//        int rev=0,rev1=0;
//        while(n!=0){
//            int a=n%8;
//            n=n/8;
//            rev=rev*10+a;
//        }
//        while(rev!=0){
//            int a=rev%10;
//            rev=rev/10;
//            rev1=rev1*10+a;
//        }
        int c=1,on=0,dn=n;
        while(dn!=0){
            int rem=dn%8;
            on+=rem*c;
            c*=10;
            dn/=8;
        }
        System.out.println(on);

    }
}
public class Assignment9B {
    public static void main(String[] args) {
        System.out.println("Enter Assignment9.Number:");
        int  n=new Scanner(System.in).nextInt();
        Number h=new HexNum();
        System.out.println("Hexadecimal:");
        h.dispName(n);
        Number o=new OctalNum();
        System.out.println("Octal:");
        o.dispName(n);
    }

}
