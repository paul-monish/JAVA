package Assignment8;
/*
G. A string with parentheses is well bracketed if all parentheses are matched: every opening bracket has a matching
closing bracket and vice versa. Write a java function wellbracketed(s) that takes a string s containing
parentheses and returns True if s is well bracketed and False otherwise.
Hint: Keep track of the nesting depth of brackets. Initially the depth is 0. The depth increases with each
opening bracket and decreases with each closing bracket. What are the constraints on the value of the nesting
depth for the string to be wellbracketed?
Here are some examples to show how your function should work.
>>> wellbracketed("22)") False
>>> wellbracketed("(a+b)(a-b)") True
>>> wellbracketed("(a(b+c)-d)((e+f)") False
 */
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
