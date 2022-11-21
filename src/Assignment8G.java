import java.util.Scanner;

public class Assignment8G {
    boolean wellBracketed(String s){
        int d=0;
        if(s.charAt(0)==')')
            return  false;
        else {
            for (char i : s.toCharArray()){
                if (i == '(')
                    d += 1;
                else if (i == ')')
                    d -= 1;
                if (d < 0)
                    return false;
            }
            return d==0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter String:");
        String s=new Scanner(System.in).nextLine();
        System.out.println(new Assignment8G().wellBracketed(s));
    }
}
